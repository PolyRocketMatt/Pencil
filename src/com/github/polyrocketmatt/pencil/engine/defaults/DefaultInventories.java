package com.github.polyrocketmatt.pencil.engine.defaults;

import com.github.polyrocketmatt.pencil.engine.factories.InventoryFactory;
import com.github.polyrocketmatt.pencil.engine.gui.action.CloseInventoryAction;
import com.github.polyrocketmatt.pencil.engine.gui.inventories.CustomInventory;
import org.bukkit.ChatColor;

import java.util.HashMap;

import static com.github.polyrocketmatt.pencil.engine.Pencil.PREFIX;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */

public class DefaultInventories {

    public static final CustomInventory PENCIL_MENU = new CustomInventory(
            new HashMap<>() {{
                put(23, new CloseInventoryAction());
            }},
            InventoryFactory.menu(InventoryFactory.ROWS_3, PREFIX + ChatColor.DARK_GRAY + "Menu")
                    .populate(10, DefaultItems.WAND)
                    .populate(15, DefaultItems.HELP)
                    .populate(16, DefaultItems.GLOBAL)
                    .getInventory(),
            ChatColor.DARK_GRAY + "Menu",
            3,
            9,
            0
    );
}
