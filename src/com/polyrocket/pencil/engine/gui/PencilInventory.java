package com.polyrocket.pencil.engine.gui;

import com.polyrocket.pencil.engine.PencilPlayer;
import com.polyrocket.pencil.engine.exception.PencilException;

import java.util.Optional;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */
public class PencilInventory {

    private final Optional<PencilInventory> previous;
    private final PencilPlayer owner;

    /**
     * Instantiates a new Pencil inventory.
     *
     * @param owner the owner
     */
    public PencilInventory(PencilPlayer owner) {
        if (owner == null)
            throw new PencilException("[Pencil] >> PencilInventory owner cannot be null on instantiation of a inventory");
        this.previous = Optional.empty();
        this.owner = owner;
    }

    /**
     * Instantiates a new Pencil inventory.
     *
     * @param previous the previous
     * @param owner    the owner
     */
    public PencilInventory(PencilInventory previous, PencilPlayer owner) {
        if (owner == null)
            throw new PencilException("[Pencil] >> PencilInventory owner cannot be null on instantiation of a inventory");
        this.previous = Optional.of(previous);
        this.owner = owner;
    }

    /**
     * Gets previous.
     *
     * @return the previous
     */
    public Optional<PencilInventory> getPrevious() {
        return previous;
    }

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public PencilPlayer getOwner() {
        return owner;
    }

    /**
     * Copy pencil inventory.
     *
     * @return the pencil inventory
     */
    public PencilInventory copy() {
        return new PencilInventory(previous.orElse(null), owner);
    }

    /**
     * Pencil inventory of.
     *
     * @param other the other
     * @return the pencil inventory of the other inventory
     */
    public static PencilInventory of(PencilInventory other) {
        return other.copy();
    }

}
