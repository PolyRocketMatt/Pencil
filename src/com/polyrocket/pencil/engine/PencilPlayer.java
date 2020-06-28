package com.polyrocket.pencil.engine;

import com.polyrocket.pencil.engine.gui.PencilInventory;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 * Abstraction of a player object that Pencil can use
 * in order to store specific plugin data for the
 * player.
 *
 * @invar getPlayer() != null
 * @invar getUUID() != null
 */

public class PencilPlayer {

    /**
     * Instance fields that contain basic information about the player.
     *
     * @invar player != null
     * @invar uuid != null
     */
    private final Player player;
    private final UUID uuid;
    private final int entityID;

    /**
     * Instance fields that contain information about the players inventorial status.
     */
    private PencilInventory inventory;

    /**
     * Creates a new PencilPlayer abstraction for a Bukkit player.
     *
     * @mutates | this
     * @inspects | player
     *
     * @throws IllegalArgumentException if  {@code player} is {@code null}
     *      | player == null
     * @post the player is now the given player
     *      | this.player == player
     * @post the uuid is now the uuid of the given player
     *      | this.uuid == player.getUniqueID()
     * @post the entityID is now the entityID of the given player
     *      | this.entityID = player.getEntityID()
     * @param player the player to construct the abstraction from
     */
    public PencilPlayer(Player player) {
        if (player == null)
            throw new IllegalArgumentException("[Pencil] >> Player cannot be null when initiating new Pencil-Player");

        this.player = player;
        this.uuid = player.getUniqueId();
        this.entityID = player.getEntityId();
    }

    /**
     * Get the player itself.
     *
     * @inspects | this
     * @return the player the abstraction is made of
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Get the UUID of the player.
     *
     * @inspects | this
     * @return the uuid of the player
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Get the entityID of the player.
     *
     * @inspects | this
     * @return the entityID of the player
     */
    public int getEntityID() {
        return entityID;
    }

    /**
     * Get the current inventory of the player.
     *
     * @creates result
     * @post result is not {@code null}
     *      | result != null
     * @return the current inventory the player has last accessed
     */
    public PencilInventory getInventory() {
        return PencilInventory.of(inventory);
    }

    /**
     * Set the current inventory of the player.
     *
     * @mutates | this
     * @throws IllegalArgumentException if {@code inventory} is {@code null}
     *      | inventory == null
     * @post the player's inventory is the given inventory
     *      | this.inventory == newInventory
     * @param newInventory the inventory to update the current one to
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
