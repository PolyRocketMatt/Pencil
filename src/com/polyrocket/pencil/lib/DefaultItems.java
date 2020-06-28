package com.polyrocket.pencil.lib;

import com.polyrocket.pencil.engine.factories.ItemFactory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class DefaultItems {

    public static final ItemStack CLOSE = ItemFactory.get(Material.BARRIER, 1, ChatColor.WHITE + "Close", true);

}
