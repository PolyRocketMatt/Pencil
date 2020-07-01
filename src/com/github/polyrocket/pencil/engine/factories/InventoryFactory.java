package com.github.polyrocket.pencil.engine.factories;

import com.github.polyrocket.pencil.engine.defaults.DefaultItems;
import com.github.polyrocket.pencil.engine.gui.inventories.EditableInventory;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import static com.github.polyrocket.pencil.engine.Pencil.PREFIX;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 * Factory that manufactures inventories.
 */

public class InventoryFactory {

    private InventoryFactory() {}

    public final static EditableInventory ROWS_3 = createInventory(PREFIX, 27);
    public final static EditableInventory ROWS_4 = createInventory(PREFIX, 36);
    public final static EditableInventory ROWS_5 = createInventory(PREFIX, 45);
    public final static EditableInventory ROWS_6 = createInventory(PREFIX, 54);

    public static EditableInventory createInventory(String name, int slots) { return new EditableInventory(Bukkit.createInventory(null, slots, PREFIX + name)); }

    public static EditableInventory of(EditableInventory inventory, String name) {
        return InventoryFactory.createInventory(name, inventory.getInventory().getSize());
    }

    public static EditableInventory fill(EditableInventory representation, String name, ItemStack item) {
        EditableInventory inventory = of(representation, name);

        for (int i = 0; i < inventory.getInventory().getSize(); i++)
            inventory.getInventory().setItem(i, item);
        return inventory;
    }

    public static EditableInventory menu(EditableInventory representation, String name) {
        EditableInventory inventory = fill(representation, name, DefaultItems.FILLER);

        int row = inventory.getInventory().getSize() % 9;

        inventory.getInventory().setItem(row + 4, DefaultItems.CLOSE);

        return inventory;
    }

    public static EditableInventory paginate(EditableInventory representation, String name) {
        EditableInventory inventory = fill(representation, name, DefaultItems.FILLER);

        int row = inventory.getInventory().getSize() % 9;

        inventory.getInventory().setItem(row + 4, DefaultItems.CLOSE);
        inventory.getInventory().setItem(row, DefaultItems.PREVIOUS);
        inventory.getInventory().setItem(row + 8, DefaultItems.NEXT);

        return inventory;
    }

}
