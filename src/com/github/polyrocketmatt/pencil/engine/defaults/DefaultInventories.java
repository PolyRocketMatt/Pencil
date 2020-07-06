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
        pages.add(woolAndCarpet(6));
        pages.add(concrete(7));
        pages.add(coral(8));
        pages.add(water(9));
        pages.add(nether(10));
        pages.add(nether2(11));
        pages.add(redStone(12));

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
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.GRAY + "Stone")
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
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLACK + "Terracotta")
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
                "Terracotta",
                6,
                9,
                id
        );
    }

    private static CustomInventory woolAndCarpet(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLACK + "Wool")
                        .populate(1, new ItemStack(Material.WHITE_WOOL))
                        .populate(2, new ItemStack(Material.ORANGE_WOOL))
                        .populate(3, new ItemStack(Material.MAGENTA_WOOL))
                        .populate(4, new ItemStack(Material.LIGHT_BLUE_WOOL))
                        .populate(5, new ItemStack(Material.YELLOW_WOOL))
                        .populate(6, new ItemStack(Material.LIME_WOOL))
                        .populate(7, new ItemStack(Material.PINK_WOOL))
                        .populate(10, new ItemStack(Material.WHITE_CARPET))
                        .populate(11, new ItemStack(Material.ORANGE_CARPET))
                        .populate(12, new ItemStack(Material.MAGENTA_CARPET))
                        .populate(13, new ItemStack(Material.LIGHT_BLUE_CARPET))
                        .populate(14, new ItemStack(Material.YELLOW_CARPET))
                        .populate(15, new ItemStack(Material.LIME_CARPET))
                        .populate(16, new ItemStack(Material.PINK_CARPET))
                        .populate(19, new ItemStack(Material.GRAY_WOOL))
                        .populate(20, new ItemStack(Material.LIGHT_GRAY_WOOL))
                        .populate(21, new ItemStack(Material.CYAN_WOOL))
                        .populate(22, new ItemStack(Material.PURPLE_WOOL))
                        .populate(23, new ItemStack(Material.BLUE_WOOL))
                        .populate(24, new ItemStack(Material.BROWN_WOOL))
                        .populate(25, new ItemStack(Material.GREEN_WOOL))
                        .populate(28, new ItemStack(Material.GRAY_CARPET))
                        .populate(29, new ItemStack(Material.LIGHT_GRAY_CARPET))
                        .populate(30, new ItemStack(Material.CYAN_CARPET))
                        .populate(31, new ItemStack(Material.PURPLE_CARPET))
                        .populate(32, new ItemStack(Material.BLUE_CARPET))
                        .populate(33, new ItemStack(Material.BROWN_CARPET))
                        .populate(34, new ItemStack(Material.GREEN_CARPET))
                        .populate(37, new ItemStack(Material.RED_WOOL))
                        .populate(38, new ItemStack(Material.RED_CARPET))
                        .populate(42, new ItemStack(Material.BLACK_WOOL))
                        .populate(43, new ItemStack(Material.BLACK_CARPET))
                        .getInventory(),
                "Wool",
                6,
                9,
                id
        );
    }

    private static CustomInventory concrete(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLACK + "Concrete")
                        .populate(1, new ItemStack(Material.WHITE_CONCRETE))
                        .populate(2, new ItemStack(Material.ORANGE_CONCRETE))
                        .populate(3, new ItemStack(Material.MAGENTA_CONCRETE))
                        .populate(4, new ItemStack(Material.LIGHT_BLUE_CONCRETE))
                        .populate(5, new ItemStack(Material.YELLOW_CONCRETE))
                        .populate(6, new ItemStack(Material.LIME_CONCRETE))
                        .populate(7, new ItemStack(Material.PINK_CONCRETE))
                        .populate(10, new ItemStack(Material.WHITE_CONCRETE_POWDER))
                        .populate(11, new ItemStack(Material.ORANGE_CONCRETE_POWDER))
                        .populate(12, new ItemStack(Material.MAGENTA_CONCRETE_POWDER))
                        .populate(13, new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER))
                        .populate(14, new ItemStack(Material.YELLOW_CONCRETE_POWDER))
                        .populate(15, new ItemStack(Material.LIME_CONCRETE_POWDER))
                        .populate(16, new ItemStack(Material.PINK_CONCRETE_POWDER))
                        .populate(19, new ItemStack(Material.GRAY_CONCRETE))
                        .populate(20, new ItemStack(Material.LIGHT_GRAY_CONCRETE))
                        .populate(21, new ItemStack(Material.CYAN_CONCRETE))
                        .populate(22, new ItemStack(Material.PURPLE_CONCRETE))
                        .populate(23, new ItemStack(Material.BLUE_CONCRETE))
                        .populate(24, new ItemStack(Material.BROWN_CONCRETE))
                        .populate(25, new ItemStack(Material.GREEN_CONCRETE))
                        .populate(28, new ItemStack(Material.GRAY_CONCRETE_POWDER))
                        .populate(29, new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER))
                        .populate(30, new ItemStack(Material.CYAN_CONCRETE_POWDER))
                        .populate(31, new ItemStack(Material.PURPLE_CONCRETE_POWDER))
                        .populate(32, new ItemStack(Material.BLUE_CONCRETE_POWDER))
                        .populate(33, new ItemStack(Material.BROWN_CONCRETE_POWDER))
                        .populate(34, new ItemStack(Material.GREEN_CONCRETE_POWDER))
                        .populate(37, new ItemStack(Material.RED_CONCRETE))
                        .populate(38, new ItemStack(Material.RED_CONCRETE_POWDER))
                        .populate(42, new ItemStack(Material.BLACK_CONCRETE))
                        .populate(43, new ItemStack(Material.BLACK_CONCRETE_POWDER))
                        .getInventory(),
                "Concrete",
                6,
                9,
                id
        );
    }

    private static CustomInventory coral(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLUE + "Coral")
                        .populate(1, new ItemStack(Material.FIRE_CORAL_BLOCK))
                        .populate(2, new ItemStack(Material.FIRE_CORAL))
                        .populate(3, new ItemStack(Material.FIRE_CORAL_FAN))
                        .populate(5, new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK))
                        .populate(6, new ItemStack(Material.DEAD_FIRE_CORAL))
                        .populate(7, new ItemStack(Material.DEAD_FIRE_CORAL_FAN))
                        .populate(10, new ItemStack(Material.HORN_CORAL_BLOCK))
                        .populate(11, new ItemStack(Material.HORN_CORAL))
                        .populate(12, new ItemStack(Material.HORN_CORAL_FAN))
                        .populate(14, new ItemStack(Material.DEAD_HORN_CORAL_BLOCK))
                        .populate(15, new ItemStack(Material.DEAD_HORN_CORAL))
                        .populate(16, new ItemStack(Material.DEAD_HORN_CORAL_FAN))
                        .populate(19, new ItemStack(Material.BRAIN_CORAL_BLOCK))
                        .populate(20, new ItemStack(Material.BRAIN_CORAL))
                        .populate(21, new ItemStack(Material.BRAIN_CORAL_FAN))
                        .populate(23, new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK))
                        .populate(24, new ItemStack(Material.DEAD_BRAIN_CORAL))
                        .populate(25, new ItemStack(Material.DEAD_BRAIN_CORAL_FAN))
                        .populate(28, new ItemStack(Material.BUBBLE_CORAL_BLOCK))
                        .populate(29, new ItemStack(Material.BUBBLE_CORAL))
                        .populate(30, new ItemStack(Material.BUBBLE_CORAL_FAN))
                        .populate(32, new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK))
                        .populate(33, new ItemStack(Material.DEAD_BUBBLE_CORAL))
                        .populate(34, new ItemStack(Material.DEAD_BUBBLE_CORAL_FAN))
                        .populate(37, new ItemStack(Material.TUBE_CORAL_BLOCK))
                        .populate(38, new ItemStack(Material.TUBE_CORAL))
                        .populate(39, new ItemStack(Material.TUBE_CORAL_FAN))
                        .populate(41, new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK))
                        .populate(42, new ItemStack(Material.DEAD_TUBE_CORAL))
                        .populate(43, new ItemStack(Material.DEAD_TUBE_CORAL_FAN))
                        .getInventory(),
                "Coral",
                6,
                9,
                id
        );
    }

    private static CustomInventory water(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLUE + "Water")
                        .populate(10, new ItemStack(Material.PRISMARINE))
                        .populate(11, new ItemStack(Material.PRISMARINE_SLAB))
                        .populate(12, new ItemStack(Material.PRISMARINE_STAIRS))
                        .populate(13, new ItemStack(Material.PRISMARINE_WALL))
                        .populate(15, new ItemStack(Material.SPONGE))
                        .populate(16, new ItemStack(Material.ICE))
                        .populate(19, new ItemStack(Material.PRISMARINE_BRICKS))
                        .populate(20, new ItemStack(Material.PRISMARINE_BRICK_SLAB))
                        .populate(21, new ItemStack(Material.PRISMARINE_BRICK_STAIRS))
                        .populate(24, new ItemStack(Material.WET_SPONGE))
                        .populate(25, new ItemStack(Material.PACKED_ICE))
                        .populate(28, new ItemStack(Material.DARK_PRISMARINE))
                        .populate(29, new ItemStack(Material.DARK_PRISMARINE_SLAB))
                        .populate(30, new ItemStack(Material.DARK_PRISMARINE_STAIRS))
                        .populate(32, new ItemStack(Material.SNOW))
                        .populate(33, new ItemStack(Material.SNOW_BLOCK))
                        .populate(34, new ItemStack(Material.BLUE_ICE))
                        .getInventory(),
                "Water",
                6,
                9,
                id
        );
    }

    private static CustomInventory nether(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.RED + "Nether")
                        .populate(1, new ItemStack(Material.NETHER_BRICK))
                        .populate(2, new ItemStack(Material.NETHER_BRICK_STAIRS))
                        .populate(3, new ItemStack(Material.NETHER_BRICK_SLAB))
                        .populate(4, new ItemStack(Material.NETHER_BRICK_WALL))
                        .populate(5, new ItemStack(Material.NETHER_BRICK_FENCE))
                        .populate(6, new ItemStack(Material.CHISELED_NETHER_BRICKS))
                        .populate(7, new ItemStack(Material.CRACKED_NETHER_BRICKS))
                        .populate(10, new ItemStack(Material.RED_NETHER_BRICKS))
                        .populate(11, new ItemStack(Material.RED_NETHER_BRICK_STAIRS))
                        .populate(12, new ItemStack(Material.RED_NETHER_BRICK_SLAB))
                        .populate(13, new ItemStack(Material.RED_NETHER_BRICK_WALL))
                        .populate(14, new ItemStack(Material.ENDER_CHEST))
                        .populate(15, new ItemStack(Material.SOUL_SAND))
                        .populate(16, new ItemStack(Material.SOUL_SOIL))
                        .populate(19, new ItemStack(Material.BLACKSTONE))
                        .populate(20, new ItemStack(Material.BLACKSTONE_STAIRS))
                        .populate(21, new ItemStack(Material.BLACKSTONE_SLAB))
                        .populate(22, new ItemStack(Material.BLACKSTONE_WALL))
                        .populate(23, new ItemStack(Material.GILDED_BLACKSTONE))
                        .populate(28, new ItemStack(Material.POLISHED_BLACKSTONE))
                        .populate(29, new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS))
                        .populate(30, new ItemStack(Material.POLISHED_BLACKSTONE_SLAB))
                        .populate(31, new ItemStack(Material.POLISHED_BLACKSTONE_WALL))
                        .populate(32, new ItemStack(Material.CRYING_OBSIDIAN))
                        .populate(33, new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                        .populate(34, new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE))
                        .populate(37, new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS))
                        .populate(38, new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS))
                        .populate(39, new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB))
                        .populate(40, new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_WALL))
                        .populate(41, new ItemStack(Material.OBSIDIAN))
                        .populate(42, new ItemStack(Material.NETHERITE_BLOCK))
                        .populate(43, new ItemStack(Material.ANCIENT_DEBRIS))
                        .getInventory(),
                "Nether",
                6,
                9,
                id
        );
    }

    private static CustomInventory nether2(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.RED + "Nether")
                        .populate(1, new ItemStack(Material.CRIMSON_NYLIUM))
                        .populate(2, new ItemStack(Material.CRIMSON_STEM))
                        .populate(3, new ItemStack(Material.CRIMSON_SLAB))
                        .populate(5, new ItemStack(Material.WARPED_SLAB))
                        .populate(6, new ItemStack(Material.WARPED_STEM))
                        .populate(7, new ItemStack(Material.WARPED_NYLIUM))
                        .populate(10, new ItemStack(Material.NETHER_WART_BLOCK))
                        .populate(11, new ItemStack(Material.CRIMSON_HYPHAE))
                        .populate(12, new ItemStack(Material.CRIMSON_STAIRS))
                        .populate(14, new ItemStack(Material.WARPED_STAIRS))
                        .populate(15, new ItemStack(Material.WARPED_HYPHAE))
                        .populate(16, new ItemStack(Material.WARPED_WART_BLOCK))
                        .populate(20, new ItemStack(Material.STRIPPED_CRIMSON_STEM))
                        .populate(21, new ItemStack(Material.CRIMSON_FENCE))
                        .populate(23, new ItemStack(Material.WARPED_FENCE))
                        .populate(24, new ItemStack(Material.STRIPPED_WARPED_STEM))
                        .populate(29, new ItemStack(Material.STRIPPED_CRIMSON_HYPHAE))
                        .populate(30, new ItemStack(Material.CRIMSON_FENCE_GATE))
                        .populate(31, new ItemStack(Material.SHROOMLIGHT))
                        .populate(32, new ItemStack(Material.WARPED_FENCE_GATE))
                        .populate(33, new ItemStack(Material.STRIPPED_WARPED_HYPHAE))
                        .populate(38, new ItemStack(Material.CRIMSON_PLANKS))
                        .populate(39, new ItemStack(Material.CRIMSON_TRAPDOOR))
                        .populate(40, new ItemStack(Material.NETHERRACK))
                        .populate(41, new ItemStack(Material.WARPED_TRAPDOOR))
                        .populate(42, new ItemStack(Material.WARPED_PLANKS))
                        .getInventory(),
                "Nether",
                6,
                9,
                id
        );
    }

    private static CustomInventory redStone(int id) {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.RED + "Nether")
                        .populate(2, new ItemStack(Material.DAYLIGHT_DETECTOR))
                        .populate(3, new ItemStack(Material.TARGET))
                        .populate(4, new ItemStack(Material.LEVER))
                        .populate(5, new ItemStack(Material.TRIPWIRE_HOOK))
                        .populate(6, new ItemStack(Material.STRING))
                        .populate(11, new ItemStack(Material.REDSTONE))
                        .populate(12, new ItemStack(Material.REPEATER))
                        .populate(13, new ItemStack(Material.COMPARATOR))
                        .populate(14, new ItemStack(Material.REDSTONE_TORCH))
                        .populate(15, new ItemStack(Material.OBSERVER))
                        .populate(20, new ItemStack(Material.RAIL))
                        .populate(21, new ItemStack(Material.DETECTOR_RAIL))
                        .populate(22, new ItemStack(Material.IRON_TRAPDOOR))
                        .populate(23, new ItemStack(Material.POWERED_RAIL))
                        .populate(24, new ItemStack(Material.ACTIVATOR_RAIL))
                        .populate(30, new ItemStack(Material.DROPPER))
                        .populate(31, new ItemStack(Material.DISPENSER))
                        .populate(32, new ItemStack(Material.HOPPER))
                        .populate(38, new ItemStack(Material.STICKY_PISTON))
                        .populate(39, new ItemStack(Material.PISTON))
                        .populate(40, new ItemStack(Material.NOTE_BLOCK))
                        .populate(41, new ItemStack(Material.TNT))
                        .populate(42, new ItemStack(Material.REDSTONE_LAMP))
                        .getInventory(),
                "Nether",
                6,
                9,
                id
        );
    }
    
    


    /*
        MATERIAL_GUI
     */
}
