package com.github.polyrocketmatt.pencil.engine.services;

import com.github.polyrocketmatt.pencil.engine.Pencil;
import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocketmatt.pencil.engine.exception.PencilException;
import com.github.polyrocketmatt.pencil.engine.utils.ExceptionReport;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */
public class PlayerService extends Service {

    private HashSet<PencilPlayer> players;

    /**
     * Instantiates a new Player service.
     */
    public PlayerService() {
        super(1);

        this.players = new HashSet<>();
    }

    @Override
    public int start() {
        System.out.println("[Pencil] >> Managing existing entities...");
        addPlayers(Bukkit.getOnlinePlayers().toArray(new Player[Bukkit.getOnlinePlayers().size()]));
        linkPlayerPermissions();
        return 0;
    }



    @Override
    public int stop() {
        return 0;
    }

    @Override
    public String dump() {
        return "PlayerService[DUMP={" + players.stream()
                .map(PencilPlayer::toString)
                .collect(Collectors.joining(", "))
                + "}]";
    }

    /**
     * Gets players.
     *
     * @return the players
     */
    public HashSet<PencilPlayer> getPlayers() {
        return new HashSet<>(players);
    }

    /**
     * Add player.
     *
     * @param player the player
     */
    public void addPlayer(Player player) {
        if (player == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Player")
            );

        PencilPlayer pencilPlayer = new PencilPlayer(player);

        if (players.stream().anyMatch(member -> member.getUUID() == pencilPlayer.getUUID()))
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.CONSOLE_PREFIX + "Player '" + player.getName() + "' already registered"
            );
        players.add(pencilPlayer);
    }

    /**
     * Add players.
     *
     * @param players the players
     */
    public void addPlayers(Player... players) {
        for (Player player : players)
            addPlayer(player);
    }

    /**
     * Remove player.
     *
     * @param player the player
     */
    public void removePlayer(PencilPlayer player) {
        if (player == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Player")
            );

        players.removeIf(member -> member.getUUID() == player.getUUID());
    }

    /**
     * Remove player.
     *
     * @param player the player
     */
    public void removePlayer(Player player) {
        if (player == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Player")
            );

        players.removeIf(member -> member.getUUID() == player.getUniqueId());
    }

    /**
     * Remove players.
     *
     * @param players the players
     */
    public void removePlayers(Player... players) {
        for (Player player : players)
            removePlayer(player);
    }

    /**
     * Gets player.
     *
     * @param player the player
     * @return the player
     */
    public PencilPlayer getPlayer(Player player) {
        if (player == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Player")
            );
        return players.stream().filter(member -> member.getUUID() == player.getUniqueId()).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "PlayerService{" +
                "players=" + players.size() +
                '}';
    }

    private void linkPlayerPermissions() {
        HashMap<String, HashSet<String>> permissions = Pencil.getPermissionService().getReadStorage();
        for (PencilPlayer player: getPlayers()) {
            for (String permission : permissions.keySet()){
                if(permissions.get(permission).contains(player.getUUID().toString())){
                    player.getPermissionAttachment().setPermission(permission);
                }
            }
        }
        Pencil.getPermissionService().clearReadStorage();
    }
}
