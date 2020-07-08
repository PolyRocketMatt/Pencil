package com.github.polyrocketmatt.pencil.engine.command;

import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.factories.InventoryFactory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

public class Gui extends AbstractCommand {
    /**
     * Instantiates a new Abstract command.
     *
     * @param name the name
     * @param type the type
     */
    public Gui(String name, CommandType type) {
        super(name, type);
    }

    // TODO: remove command
    @Override
    public void onCommand(PencilPlayer player, String[] args) {
        switch (args[0].toLowerCase()) {
            case "wood":
                wood(player);
                break;
            case "wood2":
                wood2(player);
                break;
            case "stone":
                stone(player);
                break;
            case "sand":
                sand(player);
                break;
            case "glass":
                glass(player);
                break;
            case "terracotta":
                terracotta(player);
                break;
            case "wool":
                wool(player);
                break;
            case "concrete":
                concrete(player);
                break;
            case "coral":
                coral(player);
                break;
            case "water":
                water(player);
                break;
            case "nether":
                nether(player);
                break;
            case "nether2":
                nether2(player);
                break;
            case "redstone":
                redstone(player);
                break;
            case "interior":
                interior(player);
                break;
            case "end":
                end(player);
                break;
            case "nature":
                nature(player);
                break;
            case "bed":
                bed(player);
                break;
            case "valuables":
                valuables(player);
                break;
            default:
                break;
        }
    }

    private void wood(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void wood2(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .populate(37, new ItemStack(Material.OAK_TRAPDOOR))
                        .populate(38, new ItemStack(Material.SPRUCE_TRAPDOOR))
                        .populate(39, new ItemStack(Material.BIRCH_TRAPDOOR))
                        .populate(41, new ItemStack(Material.JUNGLE_TRAPDOOR))
                        .populate(42, new ItemStack(Material.ACACIA_TRAPDOOR))
                        .populate(43, new ItemStack(Material.DARK_OAK_TRAPDOOR))
                        .getInventory()
        );
    }

    private void stone(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void sand(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void glass(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void terracotta(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void wool(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void concrete(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void coral(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .getInventory()
        );
    }

    private void water(PencilPlayer player) {
        player.getPlayer().openInventory(
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLUE + "Water")
                        .populate(10, new ItemStack(Material.PRISMARINE))
                        .populate(11, new ItemStack(Material.PRISMARINE_SLAB))
                        .populate(12, new ItemStack(Material.PRISMARINE_STAIRS))
                        .populate(13, new ItemStack(Material.PRISMARINE_WALL))
                        .populate(14, new ItemStack(Material.SNOW_BLOCK))
                        .populate(15, new ItemStack(Material.SPONGE))
                        .populate(16, new ItemStack(Material.ICE))
                        .populate(19, new ItemStack(Material.PRISMARINE_BRICKS))
                        .populate(20, new ItemStack(Material.PRISMARINE_BRICK_SLAB))
                        .populate(21, new ItemStack(Material.PRISMARINE_BRICK_STAIRS))
                        .populate(23, new ItemStack(Material.SNOW))
                        .populate(24, new ItemStack(Material.WET_SPONGE))
                        .populate(25, new ItemStack(Material.PACKED_ICE))
                        .populate(28, new ItemStack(Material.DARK_PRISMARINE))
                        .populate(29, new ItemStack(Material.DARK_PRISMARINE_SLAB))
                        .populate(30, new ItemStack(Material.DARK_PRISMARINE_STAIRS))
                        .populate(33, new ItemStack(Material.CONDUIT))
                        .populate(34, new ItemStack(Material.BLUE_ICE))
                        .getInventory()
        );
    }

    private void nether(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .populate(15, new ItemStack(Material.SOUL_SAND))
                        .populate(14, new ItemStack(Material.GILDED_BLACKSTONE))
                        .populate(16, new ItemStack(Material.SOUL_SOIL))
                        .populate(19, new ItemStack(Material.BLACKSTONE))
                        .populate(20, new ItemStack(Material.BLACKSTONE_STAIRS))
                        .populate(21, new ItemStack(Material.BLACKSTONE_SLAB))
                        .populate(22, new ItemStack(Material.BLACKSTONE_WALL))
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
                        .getInventory()
        );
    }

    private void nether2(PencilPlayer player) {
        player.getPlayer().openInventory(
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
                        .populate(22, new ItemStack(Material.MAGMA_BLOCK))
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
                        .getInventory()
        );
    }

    private void redstone(PencilPlayer player) {
        player.getPlayer().openInventory(
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.RED + "Redstone")
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
                        .getInventory()
        );
    }

    private void interior(PencilPlayer player) {
        player.getPlayer().openInventory(
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.GRAY + "Interior")
                        .populate(1, new ItemStack(Material.CRAFTING_TABLE))
                        .populate(2, new ItemStack(Material.STONECUTTER))
                        .populate(3, new ItemStack(Material.ENCHANTING_TABLE))
                        .populate(4, new ItemStack(Material.GRINDSTONE))
                        .populate(5, new ItemStack(Material.BREWING_STAND))
                        .populate(6, new ItemStack(Material.CAULDRON))
                        .populate(7, new ItemStack(Material.LOOM))
                        .populate(10, new ItemStack(Material.COMPOSTER))
                        .populate(11, new ItemStack(Material.JUKEBOX))
                        .populate(12, new ItemStack(Material.SCAFFOLDING))
                        .populate(13, new ItemStack(Material.BARREL))
                        .populate(14, new ItemStack(Material.FURNACE))
                        .populate(15, new ItemStack(Material.SMOKER))
                        .populate(16, new ItemStack(Material.BLAST_FURNACE))
                        .populate(19, new ItemStack(Material.LODESTONE))
                        .populate(20, new ItemStack(Material.LECTERN))
                        .populate(21, new ItemStack(Material.SMITHING_TABLE))
                        .populate(22, new ItemStack(Material.CARTOGRAPHY_TABLE))
                        .populate(23, new ItemStack(Material.BELL))
                        .populate(24, new ItemStack(Material.FLETCHING_TABLE))
                        .populate(25, new ItemStack(Material.BEACON))
                        .populate(28, new ItemStack(Material.ANVIL))
                        .populate(29, new ItemStack(Material.CHIPPED_ANVIL))
                        .populate(30, new ItemStack(Material.DAMAGED_ANVIL))
                        .populate(31, new ItemStack(Material.CHEST))
                        .populate(32, new ItemStack(Material.TRAPPED_CHEST))
                        .populate(33, new ItemStack(Material.ENDER_CHEST))
                        .populate(34, new ItemStack(Material.BOOKSHELF))
                        .populate(37, new ItemStack(Material.CLAY))
                        .populate(38, new ItemStack(Material.BRICKS))
                        .populate(39, new ItemStack(Material.BRICK_SLAB))
                        .populate(40, new ItemStack(Material.BRICK_STAIRS))
                        .populate(41, new ItemStack(Material.BRICK_WALL))
                        .populate(42, new ItemStack(Material.CHAIN))
                        .populate(43, new ItemStack(Material.IRON_BARS))
                        .getInventory()
        );
    }

    private void end(PencilPlayer player) {
        player.getPlayer().openInventory(
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.YELLOW + "End")
                        .populate(1, new ItemStack(Material.SHULKER_BOX))
                        .populate(2, new ItemStack(Material.WHITE_SHULKER_BOX))
                        .populate(3, new ItemStack(Material.ORANGE_SHULKER_BOX))
                        .populate(4, new ItemStack(Material.MAGENTA_SHULKER_BOX))
                        .populate(5, new ItemStack(Material.LIGHT_BLUE_SHULKER_BOX))
                        .populate(6, new ItemStack(Material.YELLOW_SHULKER_BOX))
                        .populate(7, new ItemStack(Material.LIME_SHULKER_BOX))
                        .populate(10, new ItemStack(Material.PINK_SHULKER_BOX))
                        .populate(11, new ItemStack(Material.GRAY_SHULKER_BOX))
                        .populate(12, new ItemStack(Material.LIGHT_GRAY_SHULKER_BOX))
                        .populate(13, new ItemStack(Material.CYAN_SHULKER_BOX))
                        .populate(14, new ItemStack(Material.PURPLE_SHULKER_BOX))
                        .populate(15, new ItemStack(Material.BLUE_SHULKER_BOX))
                        .populate(16, new ItemStack(Material.BROWN_SHULKER_BOX))
                        .populate(19, new ItemStack(Material.GREEN_SHULKER_BOX))
                        .populate(20, new ItemStack(Material.RED_SHULKER_BOX))
                        .populate(21, new ItemStack(Material.BLACK_SHULKER_BOX))
                        .populate(28, new ItemStack(Material.END_STONE))
                        .populate(29, new ItemStack(Material.END_STONE_BRICKS))
                        .populate(30, new ItemStack(Material.END_STONE_BRICK_SLAB))
                        .populate(31, new ItemStack(Material.END_STONE_BRICK_STAIRS))
                        .populate(32, new ItemStack(Material.END_STONE_BRICK_WALL))
                        .populate(34, new ItemStack(Material.END_PORTAL_FRAME))
                        .populate(37, new ItemStack(Material.PURPUR_PILLAR))
                        .populate(38, new ItemStack(Material.PURPUR_BLOCK))
                        .populate(39, new ItemStack(Material.PURPUR_SLAB))
                        .populate(40, new ItemStack(Material.PURPUR_STAIRS))
                        .populate(41, new ItemStack(Material.END_ROD))
                        .populate(42, new ItemStack(Material.CHORUS_PLANT))
                        .populate(43, new ItemStack(Material.CHORUS_FLOWER))
                        .getInventory()
        );
    }

    private void nature(PencilPlayer player) {
        player.getPlayer().openInventory(
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.GREEN + "Nature")
                        .populate(1, new ItemStack(Material.GRASS_BLOCK))
                        .populate(2, new ItemStack(Material.DIRT))
                        .populate(3, new ItemStack(Material.COARSE_DIRT))
                        .populate(4, new ItemStack(Material.BONE_BLOCK))
                        .populate(5, new ItemStack(Material.PODZOL))
                        .populate(6, new ItemStack(Material.MYCELIUM))
                        .populate(7, new ItemStack(Material.GRASS_PATH))
                        .populate(10, new ItemStack(Material.PUMPKIN))
                        .populate(11, new ItemStack(Material.CARVED_PUMPKIN))
                        .populate(12, new ItemStack(Material.JACK_O_LANTERN))
                        .populate(13, new ItemStack(Material.MELON))
                        .populate(14, new ItemStack(Material.MUSHROOM_STEM))
                        .populate(15, new ItemStack(Material.BROWN_MUSHROOM_BLOCK))
                        .populate(16, new ItemStack(Material.RED_MUSHROOM_BLOCK))
                        .populate(19, new ItemStack(Material.OAK_LEAVES))
                        .populate(20, new ItemStack(Material.BEE_NEST))
                        .populate(21, new ItemStack(Material.BEEHIVE))
                        .populate(22, new ItemStack(Material.SLIME_BLOCK))
                        .populate(23, new ItemStack(Material.HONEY_BLOCK))
                        .populate(24, new ItemStack(Material.HONEYCOMB_BLOCK))
                        .populate(25, new ItemStack(Material.DARK_OAK_LEAVES))
                        .populate(29, new ItemStack(Material.SPRUCE_LEAVES))
                        .populate(30, new ItemStack(Material.HAY_BLOCK))
                        .populate(31, new ItemStack(Material.TURTLE_EGG))
                        .populate(32, new ItemStack(Material.DRIED_KELP_BLOCK))
                        .populate(33, new ItemStack(Material.ACACIA_LEAVES))
                        .populate(37, new ItemStack(Material.GRAVEL))
                        .populate(39, new ItemStack(Material.BIRCH_LEAVES))
                        .populate(40, new ItemStack(Material.COBWEB))
                        .populate(41, new ItemStack(Material.JUNGLE_LEAVES))
                        .populate(43, new ItemStack(Material.BEDROCK))
                        .getInventory()

        );
    }

    private void bed(PencilPlayer player) {
        player.getPlayer().openInventory(
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLACK + "Wool")
                        .populate(1, new ItemStack(Material.WHITE_BED))
                        .populate(2, new ItemStack(Material.ORANGE_BED))
                        .populate(3, new ItemStack(Material.MAGENTA_BED))
                        .populate(4, new ItemStack(Material.LIGHT_BLUE_BED))
                        .populate(5, new ItemStack(Material.YELLOW_BED))
                        .populate(6, new ItemStack(Material.LIME_BED))
                        .populate(7, new ItemStack(Material.PINK_BED))
                        .populate(10, new ItemStack(Material.WHITE_BANNER))
                        .populate(11, new ItemStack(Material.ORANGE_BANNER))
                        .populate(12, new ItemStack(Material.MAGENTA_BANNER))
                        .populate(13, new ItemStack(Material.LIGHT_BLUE_BANNER))
                        .populate(14, new ItemStack(Material.YELLOW_BANNER))
                        .populate(15, new ItemStack(Material.LIME_BANNER))
                        .populate(16, new ItemStack(Material.PINK_BANNER))
                        .populate(19, new ItemStack(Material.GRAY_BED))
                        .populate(20, new ItemStack(Material.LIGHT_GRAY_BED))
                        .populate(21, new ItemStack(Material.CYAN_BED))
                        .populate(22, new ItemStack(Material.PURPLE_BED))
                        .populate(23, new ItemStack(Material.BLUE_BED))
                        .populate(24, new ItemStack(Material.BROWN_BED))
                        .populate(25, new ItemStack(Material.GREEN_BED))
                        .populate(28, new ItemStack(Material.GRAY_BANNER))
                        .populate(29, new ItemStack(Material.LIGHT_GRAY_BANNER))
                        .populate(30, new ItemStack(Material.CYAN_BANNER))
                        .populate(31, new ItemStack(Material.PURPLE_BANNER))
                        .populate(32, new ItemStack(Material.BLUE_BANNER))
                        .populate(33, new ItemStack(Material.BROWN_BANNER))
                        .populate(34, new ItemStack(Material.GREEN_BANNER))
                        .populate(37, new ItemStack(Material.RED_BED))
                        .populate(38, new ItemStack(Material.RED_BANNER))
                        .populate(42, new ItemStack(Material.BLACK_BED))
                        .populate(43, new ItemStack(Material.BLACK_BANNER))
                        .getInventory()
        );
    }

    private void valuables(PencilPlayer player) {
        player.getPlayer().openInventory(
                InventoryFactory.paginate(InventoryFactory.ROWS_6, ChatColor.BLACK + "Wool")
                        .populate(1, new ItemStack(Material.COAL_ORE))
                        .populate(2, new ItemStack(Material.IRON_ORE))
                        .populate(3, new ItemStack(Material.GOLD_ORE))
                        .populate(4, new ItemStack(Material.REDSTONE_ORE))
                        .populate(5, new ItemStack(Material.LAPIS_ORE))
                        .populate(6, new ItemStack(Material.DIAMOND_ORE))
                        .populate(7, new ItemStack(Material.EMERALD_ORE))
                        .populate(10, new ItemStack(Material.COAL_BLOCK))
                        .populate(11, new ItemStack(Material.IRON_BLOCK))
                        .populate(12, new ItemStack(Material.GOLD_BLOCK))
                        .populate(13, new ItemStack(Material.REDSTONE_BLOCK))
                        .populate(14, new ItemStack(Material.LAPIS_BLOCK))
                        .populate(15, new ItemStack(Material.DIAMOND_BLOCK))
                        .populate(16, new ItemStack(Material.EMERALD_BLOCK))
                        .populate(22, new ItemStack(Material.NETHER_GOLD_ORE))
                        .populate(29, new ItemStack(Material.NETHER_QUARTZ_ORE))
                        .populate(30, new ItemStack(Material.QUARTZ_BLOCK))
                        .populate(31, new ItemStack(Material.QUARTZ_SLAB))
                        .populate(32, new ItemStack(Material.QUARTZ_STAIRS))
                        .populate(33, new ItemStack(Material.QUARTZ_PILLAR))
                        .populate(38, new ItemStack(Material.QUARTZ_BRICKS))
                        .populate(39, new ItemStack(Material.SMOOTH_QUARTZ))
                        .populate(40, new ItemStack(Material.SMOOTH_QUARTZ_SLAB))
                        .populate(41, new ItemStack(Material.SMOOTH_QUARTZ_STAIRS))
                        .populate(42, new ItemStack(Material.CHISELED_QUARTZ_BLOCK))
                        .getInventory()
        );
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {

    }

    @Override
    public String getHelp() {
        return null;
    }

    @Override
    public int getArguments() {
        return 0;
    }
}
