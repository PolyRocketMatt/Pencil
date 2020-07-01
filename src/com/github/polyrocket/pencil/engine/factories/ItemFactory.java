package com.github.polyrocket.pencil.engine.factories;

import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 * Factory that manufactures items.
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
            throw new PencilException(
                    ItemFactory.class,
                    ExceptionReport.ExceptionType.BUG_RELATED,
                    ExceptionReport.Severity.HIGH,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "ItemMeta"),
                    item, name, useInternalMeta, lore
            );

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
