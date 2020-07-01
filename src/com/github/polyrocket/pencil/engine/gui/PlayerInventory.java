package com.github.polyrocket.pencil.engine.gui;

import com.github.polyrocket.pencil.engine.PencilPlayer;
import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.gui.inventories.AbstractInventory;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */
public class PlayerInventory {

    private final PlayerInventory previous;
    private final PencilPlayer owner;
    private final AbstractInventory inventory;

    /**
     * Instantiates a new Pencil inventory.
     *
     * @param owner     the owner
     * @param inventory the inventory
     */
    public PlayerInventory(PencilPlayer owner, AbstractInventory inventory) {
        if (owner == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Owner")
            );
        if (inventory == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Inventory")
            );
        this.previous = null;
        this.owner = owner;
        this.inventory = null;
    }

    /**
     * Instantiates a new Pencil inventory.
     *
     * @param previous  the previous
     * @param owner     the owner
     * @param inventory the inventory
     */
    public PlayerInventory(PlayerInventory previous, PencilPlayer owner, AbstractInventory inventory) {
        if (owner == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Owner")
            );
        if (inventory == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Owner")
            );
        this.previous = previous;
        this.owner = owner;
        this.inventory = inventory;
    }

    /**
     * Gets previous.
     *
     * @return the previous
     */
    public PlayerInventory getPrevious() {
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
     * Gets inventory.
     *
     * @return the inventory
     */
    public AbstractInventory getInventory() {
        return inventory;
    }

    /**
     * Copy pencil inventory.
     *
     * @return the pencil inventory
     */
    public PlayerInventory copy() {
        return new PlayerInventory(previous, owner, inventory);
    }

    /**
     * Pencil inventory of.
     *
     * @param other the other
     * @return the pencil inventory of the other inventory
     */
    public static PlayerInventory of(PlayerInventory other) {
        return other.copy();
    }

}