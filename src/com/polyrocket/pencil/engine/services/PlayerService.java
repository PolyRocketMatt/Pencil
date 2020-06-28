package com.polyrocket.pencil.engine.services;

import com.polyrocket.pencil.engine.PencilPlayer;
import com.polyrocket.pencil.engine.exception.PencilException;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class PlayerService extends Service {

    private HashSet<PencilPlayer> players;

    public PlayerService() {
        super(1);

        this.players = new HashSet<>();
    }

    @Override
    public int start() {
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

    public HashSet<PencilPlayer> getPlayers() {
        return new HashSet<>(players);
    }

    public void addPlayer(Player player) {
        PencilPlayer pencilPlayer = new PencilPlayer(player);
        if (players.stream().noneMatch(member -> member.getUUID() == pencilPlayer.getUUID()))
            throw new PencilException("[Pencil] >> Duplicate player registration occurred!");
        this.players.add(pencilPlayer);
    }

    public void addPlayers(Player... players) {
        for (Player player : players)
            addPlayer(player);
    }

    public void removePlayer(PencilPlayer player) {
        players.removeIf(member -> member.getUUID() == player.getUUID());
    }

    public void removePlayer(Player player) { players.removeIf(member -> member.getUUID() == player.getUniqueId()); }

    public void removePlayers(Player... players) {
        for (Player player : players)
            removePlayer(player);
    }

    public PencilPlayer getPlayer(Player player) {
        return players.stream().filter(member -> member.getUUID() == player.getUniqueId()).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "PlayerService{" +
                "players=" + players.size() +
                '}';
    }
}
