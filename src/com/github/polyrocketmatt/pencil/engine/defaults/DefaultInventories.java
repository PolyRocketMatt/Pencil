package com.github.polyrocketmatt.pencil.engine.defaults;

import com.github.polyrocketmatt.pencil.engine.factories.InventoryFactory;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */

public class DefaultInventories {

    public static final Inventory PENCIL_MENU = InventoryFactory.menu(InventoryFactory.ROWS_3, ChatColor.DARK_GRAY + "Menu")
            .populate(11, DefaultItems.WAND)
            .populate(16, DefaultItems.HELP)
            .populate(17, DefaultItems.GLOBAL)
            .getInventory();

}
