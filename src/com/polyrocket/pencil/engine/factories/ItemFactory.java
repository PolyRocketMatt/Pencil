package com.polyrocket.pencil.engine.factories;

import com.polyrocket.pencil.engine.exception.PencilException;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class ItemFactory {

    private ItemFactory() {}

    public static ItemStack get(Material material, int amount, String name, boolean useInternalMeta, String...lore) {
        ItemStack stack = new ItemStack(material, amount);

        stack.setItemMeta(meta(stack, name, useInternalMeta, lore));

        return stack;
    }

    public static ItemMeta meta(ItemStack item, String name, boolean useInternalMeta, String...lore) {
        ItemMeta meta = item.getItemMeta();

        if (meta == null)
            throw new PencilException("[Pencil] >> Meta of item was null!");

        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));

        if (useInternalMeta) {
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
            meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            meta.setUnbreakable(true);
        }

        return meta;
    }

    public static ItemStack update(ItemStack item, String name, boolean useInternalMeta, String...lore) {
        ItemStack newItem = new ItemStack(item.getType(), item.getAmount());
        newItem.setItemMeta(meta(item, name, useInternalMeta, lore));

        return newItem;
    }

}
