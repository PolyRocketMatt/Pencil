package com.github.polyrocket.pencil.engine.gui.inventories;

import com.github.polyrocket.pencil.engine.factories.InventoryFactory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */
public class EditableInventory {

    private Inventory inventory;

    /**
     * Instantiates a new Editable inventory.
     *
     * @param inventory the inventory
     */
    public EditableInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Of editable inventory.
     *
     * @param inventory the inventory
     * @param name      the name
     * @return the editable inventory
     */
    public EditableInventory of(EditableInventory inventory, String name) {
        return InventoryFactory.createInventory(name, inventory.getInventory().getSize());
    }

    /**
     * Fill editable inventory.
     *
     * @param representation the representation
     * @param name           the name
     * @param item           the item
     * @return the editable inventory
     */
    public EditableInventory fill(EditableInventory representation, String name, ItemStack item) {
        return InventoryFactory.fill(representation, name, item);
    }

    /**
     * Menufy editable inventory.
     *
     * @param representation the representation
     * @param name           the name
     * @return the editable inventory
     */
    public EditableInventory menu(EditableInventory representation, String name) {
        return InventoryFactory.menu(representation, name);
    }

    /**
     * Paginate editable inventory.
     *
     * @param representation the representation
     * @param name           the name
     * @return the editable inventory
     */
    public EditableInventory paginate(EditableInventory representation, String name) {
        return InventoryFactory.paginate(representation, name);
    }

    /**
     * Populate editable inventory.
     *
     * @param i    the
     * @param item the item
     * @return the editable inventory
     */
    public EditableInventory populate(int i, ItemStack item) {
        inventory.setItem(i, item);
        return this;
    }

}