package com.github.polyrocketmatt.pencil.engine.factories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Skull;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.UUID;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 * Factory that manufactures skull items.
 */

public class SkullFactory {

    private SkullFactory() {}

    public static ItemStack fromUUID(UUID uuid) {
        return itemFromUUID(getPlayerSkullItem(), uuid);
    }

    public static ItemStack itemFromUUID(ItemStack item, UUID uuid) {
        notNull(item, "item");
        notNull(uuid, "id");

        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setOwningPlayer(Bukkit.getOfflinePlayer(uuid));
        item.setItemMeta(meta);

        return item;
    }

    public static ItemStack itemFromUrl(String url) {

        return itemFromUrl(getPlayerSkullItem(), url);
    }

    public static ItemStack itemFromUrl(ItemStack item, String url) {
        notNull(item, "item");
        notNull(url, "url");

        return itemWithBase64(item, urlToBase64(url));
    }

    public static ItemStack itemFromBase64(String base64) {
        ItemStack item = getPlayerSkullItem();
        return itemWithBase64(item, base64);
    }

    public static ItemStack itemWithBase64(ItemStack item, String base64) {
        notNull(item, "item");
        notNull(base64, "base64");

        UUID hashAsId = new UUID(base64.hashCode(), base64.hashCode());
        if (Bukkit.getVersion().contains("1.16")) {
            long m = hashAsId.getMostSignificantBits();
            long l = hashAsId.getLeastSignificantBits();
            int[] id = new int[]{(int) l, (int) (l >> 32), (int) m, (int) (m >> 32)};
            return Bukkit.getUnsafe().modifyItemStack(item,
                    "{SkullOwner:{Id:[I;" + id[0] + "," + id[1] + "," + id[2] + "," + id[3] + "],Properties:{textures:[{Value:\"" + base64 + "\"}]}}}"
            );
        } else {
            return Bukkit.getUnsafe().modifyItemStack(item,
                    "{SkullOwner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + base64 + "\"}]}}}"
            );
        }
    }

    public static void blockFromUUID(Block block, UUID uuid) {
        notNull(block, "block");
        notNull(uuid, "id");

        setBlockType(block);
        ((Skull) block.getState()).setOwningPlayer(Bukkit.getOfflinePlayer(uuid));
    }

    public static void blockFromUrl(Block block, String url) {
        notNull(block, "block");
        notNull(url, "url");

        blockWithBase64(block, urlToBase64(url));
    }

    public static void blockWithBase64(Block block, String base64) {
        notNull(block, "block");
        notNull(base64, "base64");

        UUID hashAsId = new UUID(base64.hashCode(), base64.hashCode());

        String args = String.format(
                "%d %d %d %s",
                block.getX(),
                block.getY(),
                block.getZ(),
                "{Owner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + base64 + "\"}]}}}"
        );

        if (newerApi())
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "data merge block " + args);
        else
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"blockdata " + args);
    }

    private static boolean newerApi() {
        try {
            Material.valueOf("PLAYER_HEAD");
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private static ItemStack getPlayerSkullItem() {
        if (newerApi())
            return new ItemStack(Material.valueOf("PLAYER_HEAD"));
        else
            return new ItemStack(Material.valueOf("SKULL_ITEM"), 1, (byte) 3);
    }

    private static void setBlockType(Block block) {
        try {
            block.setType(Material.valueOf("PLAYER_HEAD"), false);
        } catch (IllegalArgumentException e) {
            block.setType(Material.valueOf("SKULL"), false);
        }
    }

    private static void notNull(Object object, String name) {
        if (object == null)
            throw new NullPointerException(name + " should not be null!");
    }

    private static String urlToBase64(String url) {
        URI actualUrl;

        try {
            actualUrl = new URI(url);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        String toEncode = "{\"textures\":{\"SKIN\":{\"url\":\"" + actualUrl.toString() + "\"}}}";
        return Base64.getEncoder().encodeToString(toEncode.getBytes());
    }

}
