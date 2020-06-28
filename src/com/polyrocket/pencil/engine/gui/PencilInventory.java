package com.polyrocket.pencil.engine.gui;

import com.polyrocket.pencil.engine.PencilPlayer;

import java.util.Optional;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 * Abstraction of a custom GUI. This is part
 * of the small PencilGUI API.
 *
 * @invar getOwner() != null
 */

public class PencilInventory {

    /**
     * Instance fields that store basic data of the inventory.
     *
     * @invar owner != null
     */
    private final Optional<PencilInventory> previous;
    private final PencilPlayer owner;

    /**
     * Creates a new PencilInventory abstraction for a player.
     *
     * @mutates | this
     *
     * @throws IllegalArgumentException if {@code owner} is {@code null}
     *      | owner == null
     * @post the owner of the inventory is the given player
     *      | this.owner == owner
     * @param owner the owner of the current inventory
     */
    public PencilInventory(PencilPlayer owner) {
        if (owner == null)
            throw new IllegalArgumentException("[Pencil] >> PencilInventory owner cannot be null on instantiation of a inventory");
        this.previous = Optional.empty();
        this.owner = owner;
    }

    /**
     * Creates a new PencilInventory abstraction for a player
     * and stores a previous PencilInventory.
     *
     * @mutates | this
     * @inspects previous
     *
     * @throws IllegalArgumentException if {@code owner} is {@code null}
     *      | owner == null
     * @post the previous inventory is the given inventory
     *      | this.previous == previous
     * @post the owner of the inventory is the given player
     *      | this.owner == owner;
     * @param previous the previous inventory
     * @param owner the owner of the current inventory
     */
    public PencilInventory(PencilInventory previous, PencilPlayer owner) {
        if (owner == null)
            throw new IllegalArgumentException("[Pencil] >> PencilInventory owner cannot be null on instantiation of a inventory");
        this.previous = Optional.of(previous);
        this.owner = owner;
    }

    /**
     * Get the previous inventory.
     *
     * @inspects | this
     * @return the optional previous inventory
     */
    public Optional<PencilInventory> getPrevious() {
        return previous;
    }

    /**
     * Get the owner of the inventory.
     *
     * @inspects | this
     * @return the owner of the inventory
     */
    public PencilPlayer getOwner() {
        return owner;
    }

    /**
     * Create a copy of the current abstraction.
     *
     * @creates result
     * @post the result is not {@code null}
     *      | result != null
     * @return a copy of this inventory
     */
    public PencilInventory copy() {
        return new PencilInventory(previous.orElse(null), owner);
    }

    /**
     * Create a new PencilInventory based on another one.
     *
     * @creates result
     * @inspects | other
     *
     * @post result is not {@code null}
     *      | result != null
     * @param other the inventory to base the new inventory on
     * @return a copy of the given inventory
     */
    public static PencilInventory of(PencilInventory other) {
        return other.copy();
    }

}
