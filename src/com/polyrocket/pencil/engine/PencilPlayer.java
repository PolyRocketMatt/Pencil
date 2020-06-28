package com.polyrocket.pencil.engine;

import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */

public class PencilPlayer {

    private Player player;
    private UUID uuid;
    private int entityID;

    public PencilPlayer(Player player) {
        this.player = player;
        this.uuid = player.getUniqueId();
        this.entityID = player.getEntityId();
    }

    public Player getPlayer() {
        return player;
    }

    public UUID getUUID() {
        return uuid;
    }

    public int getEntityID() {
        return entityID;
    }

    @Override
    public String toString() {
        return "PencilPlayer{" +
                "player=" + player +
                ", uuid=" + uuid +
                ", entityID=" + entityID +
                '}';
    }
}
