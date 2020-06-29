package com.polyrocket.pencil.engine;

import com.polyrocket.pencil.engine.gui.PencilInventory;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 * Abstraction of a player object that Pencil can use
 * in order to store specific plugin data for the
 * player.
 */
public class PencilPlayer {

    private final Player player;
    private final UUID uuid;
    private final int entityID;

    private PencilInventory inventory;

    /**
     * Instantiates a new Pencil player.
     *
     * @param player the player
     */
    public PencilPlayer(Player player) {
        if (player == null)
            throw new IllegalArgumentException("[Pencil] >> Player cannot be null when initiating new Pencil-Player");

        this.player = player;
        this.uuid = player.getUniqueId();
        this.entityID = player.getEntityId();
    }

    /**
     * Gets player.
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets uuid.
     *
     * @return the uuid
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Gets entity id.
     *
     * @return the entity id
     */
    public int getEntityID() {
        return entityID;
    }

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public PencilInventory getInventory() {
        return PencilInventory.of(inventory);
    }

    /**
     * Sets inventory.
     *
     * @param newInventory the new inventory
     */
    public void setInventory(PencilInventory newInventory) {
        if (inventory == null)
            throw new IllegalArgumentException("[Pencil] >> Inventory cannot be null when assigning it to a player");
        this.inventory = newInventory;
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
