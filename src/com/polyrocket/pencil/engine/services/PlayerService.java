package com.polyrocket.pencil.engine.services;

import com.polyrocket.pencil.engine.PencilPlayer;
import com.polyrocket.pencil.engine.exception.PencilException;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

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

        return 0;
    }

    @Override
    public int stop() {
        return 0;
    }

    @Override
    public String dump() {
        return players.stream()
                .map(PencilPlayer::toString)
                .collect(Collectors.joining(", "));
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
            throw new PencilException("[Pencil] >> Player cannot be null when adding to plugin");

        PencilPlayer pencilPlayer = new PencilPlayer(player);

        if (players.stream().anyMatch(member -> member.getUUID() == pencilPlayer.getUUID()))
            throw new PencilException("[Pencil] >> Duplicate player registration occurred");
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
            throw new PencilException("[Pencil] >> Player cannot be null when removing from plugin");

        players.removeIf(member -> member.getUUID() == player.getUUID());
    }

    /**
     * Remove player.
     *
     * @param player the player
     */
    public void removePlayer(Player player) {
        if (player == null)
            throw new PencilException("[Pencil] >> Player cannot be null when removing from plugin");

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
            throw new PencilException("[Pencil] >> Player cannot be null when looking for one");
        return players.stream().filter(member -> member.getUUID() == player.getUniqueId()).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "PlayerService{" +
                "players=" + players.size() +
                '}';
    }
}
