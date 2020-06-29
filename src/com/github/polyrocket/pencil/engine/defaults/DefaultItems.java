package com.github.polyrocket.pencil.engine.defaults;

import com.github.polyrocket.pencil.engine.factories.ItemFactory;
import com.github.polyrocket.pencil.engine.factories.SkullFactory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static com.github.polyrocket.pencil.engine.Pencil.PREFIX;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class DefaultItems {

    private DefaultItems() {}

    public static final ItemStack FILLER = ItemFactory.get(Material.GRAY_STAINED_GLASS_PANE, 1, "", true);
    public static final ItemStack CLOSE = ItemFactory.get(Material.BARRIER, 1, ChatColor.WHITE + "Close", true);
    public static final ItemStack PREVIOUS = SkullFactory.itemFromBase64(DefaultHeads.ARROW_LEFT);
    public static final ItemStack NEXT = SkullFactory.itemFromBase64(DefaultHeads.ARROW_RIGHT);
    public static final ItemStack HELP = SkullFactory.itemFromBase64(DefaultHeads.BOOKS);
    public static final ItemStack GLOBAL = SkullFactory.itemFromBase64(DefaultHeads.GLOBE);
    public static final ItemStack WAND = ItemFactory.get(Material.DIAMOND_AXE, 1, PREFIX + ChatColor.WHITE + "Wand", true);

}
