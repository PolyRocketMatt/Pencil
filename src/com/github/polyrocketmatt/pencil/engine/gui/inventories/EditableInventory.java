package com.github.polyrocketmatt.pencil.engine.gui.inventories;

import com.github.polyrocketmatt.pencil.engine.factories.InventoryFactory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */
public class EditableInventory implements AbstractInventory {

    private final Inventory inventory;
    private final int slots;

    /**
     * Instantiates a new Editable inventory.
     *
     * @param inventory the inventory
     */
    public EditableInventory(Inventory inventory, int slots) {
        this.inventory = inventory;
        this.slots = slots;
    }

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public int getSlots() {
        return slots;
    }

    /**
     * Of editable inventory.
     *
     * @param name      the name
     * @return the editable inventory
     */
    public EditableInventory of(String name) {
        return InventoryFactory.createInventory(name, this.getInventory().getSize());
    }

    /**
     * Fill editable inventory.
     *
     * @param name           the name
     * @param item           the item
     * @return the editable inventory
     */
    public EditableInventory fill(String name, ItemStack item) {
        return InventoryFactory.fill(this, name, item);
    }

    /**
     * Menufy editable inventory.
     *
     * @param name           the name
     * @return the editable inventory
     */
    public EditableInventory menu(String name) {
        return InventoryFactory.menu(this, name);
    }

    /**
     * Paginate editable inventory.
     *
     * @param name           the name
     * @return the editable inventory
     */
    public EditableInventory paginate(String name) {
        return InventoryFactory.paginate(this, name);
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