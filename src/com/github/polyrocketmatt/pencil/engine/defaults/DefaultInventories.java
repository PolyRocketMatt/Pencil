package com.github.polyrocketmatt.pencil.engine.defaults;

import com.github.polyrocketmatt.pencil.engine.factories.InventoryFactory;
import com.github.polyrocketmatt.pencil.engine.gui.action.CloseInventoryAction;
import com.github.polyrocketmatt.pencil.engine.gui.inventories.CustomInventory;
import com.github.polyrocketmatt.pencil.engine.gui.inventories.PagedInventory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public static final PagedInventory MATERIAL_GUI = createMaterialPages();




    /*
        MATERIAL_GUI
     */

    private static PagedInventory createMaterialPages() {
        List<CustomInventory> pages = new ArrayList<>();

        pages.add(woodenBlocks(0));
        pages.add(woodenProducts(1));
        pages.add(stoneBlocks(2));
        pages.add(sand(3));
        pages.add(glassBlocksAndPanes(4));
        pages.add(terracotta(5));

        return new PagedInventory(pages);
    }




    private static CustomInventory woodenBlocks(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.GOLD + "Wood")
                        .populate(1, new ItemStack(Material.OAK_LOG))
                        .populate(2, new ItemStack(Material.SPRUCE_LOG))
                        .populate(3, new ItemStack(Material.BIRCH_LOG))
                        .populate(5, new ItemStack(Material.JUNGLE_LOG))
                        .populate(6, new ItemStack(Material.ACACIA_LOG))
                        .populate(7, new ItemStack(Material.DARK_OAK_LOG))
                        .populate(10, new ItemStack(Material.OAK_WOOD))
                        .populate(11, new ItemStack(Material.SPRUCE_WOOD))
                        .populate(12, new ItemStack(Material.BIRCH_WOOD))
                        .populate(14, new ItemStack(Material.JUNGLE_WOOD))
                        .populate(15, new ItemStack(Material.ACACIA_WOOD))
                        .populate(16, new ItemStack(Material.DARK_OAK_WOOD))
                        .populate(19, new ItemStack(Material.STRIPPED_OAK_LOG))
                        .populate(20, new ItemStack(Material.STRIPPED_SPRUCE_LOG))
                        .populate(21, new ItemStack(Material.STRIPPED_BIRCH_LOG))
                        .populate(23, new ItemStack(Material.STRIPPED_JUNGLE_LOG))
                        .populate(24, new ItemStack(Material.STRIPPED_ACACIA_LOG))
                        .populate(25, new ItemStack(Material.STRIPPED_DARK_OAK_LOG))
                        .populate(28, new ItemStack(Material.STRIPPED_OAK_WOOD))
                        .populate(29, new ItemStack(Material.STRIPPED_SPRUCE_WOOD))
                        .populate(30, new ItemStack(Material.STRIPPED_BIRCH_WOOD))
                        .populate(32, new ItemStack(Material.STRIPPED_JUNGLE_WOOD))
                        .populate(33, new ItemStack(Material.STRIPPED_ACACIA_WOOD))
                        .populate(34, new ItemStack(Material.STRIPPED_DARK_OAK_WOOD))
                        .populate(37, new ItemStack(Material.OAK_PLANKS))
                        .populate(38, new ItemStack(Material.SPRUCE_PLANKS))
                        .populate(39, new ItemStack(Material.BIRCH_PLANKS))
                        .populate(41, new ItemStack(Material.JUNGLE_PLANKS))
                        .populate(42, new ItemStack(Material.ACACIA_PLANKS))
                        .populate(43, new ItemStack(Material.DARK_OAK_PLANKS))
                        .getInventory(),
                "Wood",
                6,
                9,
                id
        );
    }

    private static CustomInventory woodenProducts(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.GOLD + "Wood")
                        .populate(1, new ItemStack(Material.OAK_SLAB))
                        .populate(2, new ItemStack(Material.SPRUCE_SLAB))
                        .populate(3, new ItemStack(Material.BIRCH_SLAB))
                        .populate(5, new ItemStack(Material.JUNGLE_SLAB))
                        .populate(6, new ItemStack(Material.ACACIA_SLAB))
                        .populate(7, new ItemStack(Material.DARK_OAK_SLAB))
                        .populate(10, new ItemStack(Material.OAK_STAIRS))
                        .populate(11, new ItemStack(Material.SPRUCE_STAIRS))
                        .populate(12, new ItemStack(Material.BIRCH_STAIRS))
                        .populate(14, new ItemStack(Material.JUNGLE_STAIRS))
                        .populate(15, new ItemStack(Material.ACACIA_STAIRS))
                        .populate(16, new ItemStack(Material.DARK_OAK_STAIRS))
                        .populate(19, new ItemStack(Material.OAK_FENCE))
                        .populate(20, new ItemStack(Material.SPRUCE_FENCE))
                        .populate(21, new ItemStack(Material.BIRCH_FENCE))
                        .populate(23, new ItemStack(Material.JUNGLE_FENCE))
                        .populate(24, new ItemStack(Material.ACACIA_FENCE))
                        .populate(25, new ItemStack(Material.DARK_OAK_FENCE))
                        .populate(28, new ItemStack(Material.OAK_FENCE_GATE))
                        .populate(29, new ItemStack(Material.SPRUCE_FENCE_GATE))
                        .populate(30, new ItemStack(Material.BIRCH_FENCE_GATE))
                        .populate(32, new ItemStack(Material.JUNGLE_FENCE_GATE))
                        .populate(33, new ItemStack(Material.ACACIA_FENCE_GATE))
                        .populate(34, new ItemStack(Material.DARK_OAK_FENCE_GATE))
                        .populate(37, new ItemStack(Material.OAK_LEAVES))
                        .populate(38, new ItemStack(Material.SPRUCE_LEAVES))
                        .populate(39, new ItemStack(Material.BIRCH_LEAVES))
                        .populate(41, new ItemStack(Material.JUNGLE_LEAVES))
                        .populate(42, new ItemStack(Material.ACACIA_LEAVES))
                        .populate(43, new ItemStack(Material.DARK_OAK_LEAVES))
                        .getInventory(),
                "Wood",
                6,
                9,
                id
        );
    }

    private static CustomInventory stoneBlocks(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.GRAY + "Wood")
                        .populate(0, new ItemStack(Material.SMOOTH_STONE))
                        .populate(1, new ItemStack(Material.STONE))
                        .populate(2, new ItemStack(Material.GRANITE))
                        .populate(3, new ItemStack(Material.POLISHED_GRANITE))
                        .populate(4, new ItemStack(Material.DIORITE))
                        .populate(5, new ItemStack(Material.POLISHED_DIORITE))
                        .populate(6, new ItemStack(Material.ANDESITE))
                        .populate(7, new ItemStack(Material.POLISHED_ANDESITE))
                        .populate(8, new ItemStack(Material.SMOOTH_STONE_SLAB))
                        .populate(9, new ItemStack(Material.COBBLESTONE_WALL))
                        .populate(10, new ItemStack(Material.STONE_SLAB))
                        .populate(11, new ItemStack(Material.GRANITE_SLAB))
                        .populate(12, new ItemStack(Material.POLISHED_GRANITE_SLAB))
                        .populate(13, new ItemStack(Material.DIORITE_SLAB))
                        .populate(14, new ItemStack(Material.POLISHED_DIORITE_SLAB))
                        .populate(15, new ItemStack(Material.ANDESITE_SLAB))
                        .populate(16, new ItemStack(Material.POLISHED_ANDESITE_SLAB))
                        .populate(17, new ItemStack(Material.GRANITE_WALL))
                        .populate(18, new ItemStack(Material.MOSSY_COBBLESTONE_WALL))
                        .populate(19, new ItemStack(Material.STONE_STAIRS))
                        .populate(20, new ItemStack(Material.GRANITE_STAIRS))
                        .populate(21, new ItemStack(Material.POLISHED_GRANITE_STAIRS))
                        .populate(22, new ItemStack(Material.DIORITE_STAIRS))
                        .populate(23, new ItemStack(Material.POLISHED_DIORITE_STAIRS))
                        .populate(24, new ItemStack(Material.ANDESITE_STAIRS))
                        .populate(25, new ItemStack(Material.POLISHED_ANDESITE_STAIRS))
                        .populate(26, new ItemStack(Material.DIORITE_WALL))
                        .populate(16, new ItemStack(Material.STONE_BRICK_WALL))
                        .populate(28, new ItemStack(Material.STONE_BRICKS))
                        .populate(29, new ItemStack(Material.MOSSY_STONE_BRICKS))
                        .populate(30, new ItemStack(Material.STONE_BRICK_STAIRS))
                        .populate(31, new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS))
                        .populate(32, new ItemStack(Material.STONE_BRICK_SLAB))
                        .populate(33, new ItemStack(Material.MOSSY_STONE_BRICK_SLAB))
                        .populate(34, new ItemStack(Material.CHISELED_STONE_BRICKS))
                        .populate(35, new ItemStack(Material.ANDESITE_WALL))
                        .populate(37, new ItemStack(Material.COBBLESTONE))
                        .populate(38, new ItemStack(Material.MOSSY_COBBLESTONE))
                        .populate(39, new ItemStack(Material.COBBLESTONE_STAIRS))
                        .populate(40, new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS))
                        .populate(41, new ItemStack(Material.COBBLESTONE_SLAB))
                        .populate(42, new ItemStack(Material.MOSSY_COBBLESTONE_SLAB))
                        .populate(43, new ItemStack(Material.CRACKED_STONE_BRICKS))
                        .getInventory(),
                "Stone",
                6,
                9,
                id
        );
    }

    private static CustomInventory sand(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.YELLOW + "Sand")
                        .populate(1, new ItemStack(Material.SANDSTONE))
                        .populate(2, new ItemStack(Material.SMOOTH_SANDSTONE))
                        .populate(3, new ItemStack(Material.CUT_SANDSTONE))
                        .populate(5, new ItemStack(Material.RED_SANDSTONE))
                        .populate(6, new ItemStack(Material.SMOOTH_RED_SANDSTONE))
                        .populate(7, new ItemStack(Material.CUT_RED_SANDSTONE))
                        .populate(10, new ItemStack(Material.SANDSTONE_SLAB))
                        .populate(11, new ItemStack(Material.SMOOTH_SANDSTONE_SLAB))
                        .populate(12, new ItemStack(Material.CUT_SANDSTONE_SLAB))
                        .populate(14, new ItemStack(Material.RED_SANDSTONE_SLAB))
                        .populate(15, new ItemStack(Material.SMOOTH_RED_SANDSTONE_SLAB))
                        .populate(16, new ItemStack(Material.CUT_RED_SANDSTONE_SLAB))
                        .populate(19, new ItemStack(Material.SANDSTONE_STAIRS))
                        .populate(20, new ItemStack(Material.SMOOTH_SANDSTONE_STAIRS))
                        .populate(21, new ItemStack(Material.SANDSTONE_WALL))
                        .populate(23, new ItemStack(Material.RED_SANDSTONE_STAIRS))
                        .populate(24, new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS))
                        .populate(25, new ItemStack(Material.RED_SANDSTONE_WALL))
                        .populate(28, new ItemStack(Material.CHISELED_SANDSTONE))
                        .populate(29, new ItemStack(Material.SAND))
                        .populate(32, new ItemStack(Material.CHISELED_RED_SANDSTONE))
                        .populate(33, new ItemStack(Material.RED_SAND))
                        .getInventory(),
                "Sand",
                6,
                9,
                id
        );
    }

    private static CustomInventory glassBlocksAndPanes(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLACK + "Glass")
                        .populate(1, new ItemStack(Material.GLASS))
                        .populate(2, new ItemStack(Material.WHITE_STAINED_GLASS))
                        .populate(3, new ItemStack(Material.ORANGE_STAINED_GLASS))
                        .populate(4, new ItemStack(Material.MAGENTA_STAINED_GLASS))
                        .populate(5, new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS))
                        .populate(6, new ItemStack(Material.YELLOW_STAINED_GLASS))
                        .populate(7, new ItemStack(Material.LIME_STAINED_GLASS))
                        .populate(10, new ItemStack(Material.GLASS_PANE))
                        .populate(11, new ItemStack(Material.WHITE_STAINED_GLASS_PANE))
                        .populate(12, new ItemStack(Material.ORANGE_STAINED_GLASS_PANE))
                        .populate(13, new ItemStack(Material.MAGENTA_STAINED_GLASS_PANE))
                        .populate(14, new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE))
                        .populate(15, new ItemStack(Material.YELLOW_STAINED_GLASS_PANE))
                        .populate(16, new ItemStack(Material.LIME_STAINED_GLASS_PANE))
                        .populate(19, new ItemStack(Material.PINK_STAINED_GLASS))
                        .populate(20, new ItemStack(Material.GRAY_STAINED_GLASS))
                        .populate(21, new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS))
                        .populate(22, new ItemStack(Material.CYAN_STAINED_GLASS))
                        .populate(23, new ItemStack(Material.PURPLE_STAINED_GLASS))
                        .populate(24, new ItemStack(Material.BLUE_STAINED_GLASS))
                        .populate(25, new ItemStack(Material.BROWN_STAINED_GLASS))
                        .populate(28, new ItemStack(Material.PINK_STAINED_GLASS_PANE))
                        .populate(29, new ItemStack(Material.GRAY_STAINED_GLASS_PANE))
                        .populate(30, new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE))
                        .populate(31, new ItemStack(Material.CYAN_STAINED_GLASS_PANE))
                        .populate(32, new ItemStack(Material.PURPLE_STAINED_GLASS_PANE))
                        .populate(33, new ItemStack(Material.BLUE_STAINED_GLASS_PANE))
                        .populate(34, new ItemStack(Material.BROWN_STAINED_GLASS_PANE))
                        .populate(37, new ItemStack(Material.GREEN_STAINED_GLASS))
                        .populate(38, new ItemStack(Material.GREEN_STAINED_GLASS_PANE))
                        .populate(39, new ItemStack(Material.RED_STAINED_GLASS))
                        .populate(41, new ItemStack(Material.RED_STAINED_GLASS_PANE))
                        .populate(42, new ItemStack(Material.BLACK_STAINED_GLASS))
                        .populate(43, new ItemStack(Material.BLACK_STAINED_GLASS_PANE))
                        .getInventory(),
                "Glass",
                6,
                9,
                id
        );
    }

    private static CustomInventory terracotta(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLACK + "Glass")
                        .populate(1, new ItemStack(Material.WHITE_TERRACOTTA))
                        .populate(2, new ItemStack(Material.ORANGE_TERRACOTTA))
                        .populate(3, new ItemStack(Material.MAGENTA_TERRACOTTA))
                        .populate(4, new ItemStack(Material.LIGHT_BLUE_TERRACOTTA))
                        .populate(5, new ItemStack(Material.YELLOW_TERRACOTTA))
                        .populate(6, new ItemStack(Material.LIME_TERRACOTTA))
                        .populate(7, new ItemStack(Material.PINK_TERRACOTTA))
                        .populate(10, new ItemStack(Material.WHITE_GLAZED_TERRACOTTA))
                        .populate(11, new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA))
                        .populate(12, new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA))
                        .populate(13, new ItemStack(Material.LIGHT_BLUE_GLAZED_TERRACOTTA))
                        .populate(14, new ItemStack(Material.YELLOW_GLAZED_TERRACOTTA))
                        .populate(15, new ItemStack(Material.LIME_GLAZED_TERRACOTTA))
                        .populate(16, new ItemStack(Material.PINK_GLAZED_TERRACOTTA))
                        .populate(19, new ItemStack(Material.GRAY_TERRACOTTA))
                        .populate(20, new ItemStack(Material.LIGHT_GRAY_TERRACOTTA))
                        .populate(21, new ItemStack(Material.CYAN_TERRACOTTA))
                        .populate(22, new ItemStack(Material.PURPLE_TERRACOTTA))
                        .populate(23, new ItemStack(Material.BLUE_TERRACOTTA))
                        .populate(24, new ItemStack(Material.BROWN_TERRACOTTA))
                        .populate(25, new ItemStack(Material.GREEN_TERRACOTTA))
                        .populate(28, new ItemStack(Material.GRAY_GLAZED_TERRACOTTA))
                        .populate(29, new ItemStack(Material.LIGHT_GRAY_GLAZED_TERRACOTTA))
                        .populate(30, new ItemStack(Material.CYAN_GLAZED_TERRACOTTA))
                        .populate(31, new ItemStack(Material.PURPLE_GLAZED_TERRACOTTA))
                        .populate(32, new ItemStack(Material.BLUE_GLAZED_TERRACOTTA))
                        .populate(33, new ItemStack(Material.BROWN_GLAZED_TERRACOTTA))
                        .populate(34, new ItemStack(Material.GREEN_GLAZED_TERRACOTTA))
                        .populate(37, new ItemStack(Material.RED_TERRACOTTA))
                        .populate(38, new ItemStack(Material.RED_GLAZED_TERRACOTTA))
                        .populate(40, new ItemStack(Material.TERRACOTTA))
                        .populate(42, new ItemStack(Material.BLACK_TERRACOTTA))
                        .populate(43, new ItemStack(Material.BLACK_GLAZED_TERRACOTTA))
                        .getInventory(),
                "Glass",
                6,
                9,
                id
        );
    }
    /*
        MATERIAL_GUI
     */
}
