package com.github.polyrocketmatt.pencil.engine.gui;

import com.github.polyrocketmatt.pencil.engine.Pencil;
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

public class MaterialGUI {
    private final PagedInventory MaterialGUI;

    public MaterialGUI() {
        MaterialGUI = createPages();
    }

    public PagedInventory getMaterialGUI() {
        return MaterialGUI;
    }

    private PagedInventory createPages() {
        List<CustomInventory> pages = new ArrayList<>();

        pages.add(woodenBlocks());
        pages.add(woodenProducts1());
        pages.add(woodenProducts2());
        
        return new PagedInventory(pages);
    }

    private CustomInventory woodenBlocks() {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, Pencil.PREFIX + ChatColor.GOLD + "Wood")
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
                0
        );
    }

    private CustomInventory woodenProducts1() {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, Pencil.PREFIX + ChatColor.GOLD + "Wood")
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
                        .populate(37, new ItemStack(Material.OAK_DOOR))
                        .populate(38, new ItemStack(Material.SPRUCE_DOOR))
                        .populate(39, new ItemStack(Material.BIRCH_DOOR))
                        .populate(41, new ItemStack(Material.JUNGLE_DOOR))
                        .populate(42, new ItemStack(Material.ACACIA_DOOR))
                        .populate(43, new ItemStack(Material.DARK_OAK_DOOR))
                        .getInventory(),
                "Wood",
                6,
                9,
                0
        );
    }

    private CustomInventory woodenProducts2() {
        return new CustomInventory(
                new HashMap<>() {{
                    put(49, new CloseInventoryAction());
                }},
                InventoryFactory.paginate(InventoryFactory.ROWS_6, Pencil.PREFIX + ChatColor.GOLD + "Wood")
                        .populate(1, new ItemStack(Material.OAK_SIGN))
                        .populate(2, new ItemStack(Material.SPRUCE_SIGN))
                        .populate(3, new ItemStack(Material.BIRCH_SIGN))
                        .populate(5, new ItemStack(Material.JUNGLE_SIGN))
                        .populate(6, new ItemStack(Material.ACACIA_SIGN))
                        .populate(7, new ItemStack(Material.DARK_OAK_SIGN))
                        .populate(10, new ItemStack(Material.OAK_PRESSURE_PLATE))
                        .populate(11, new ItemStack(Material.SPRUCE_PRESSURE_PLATE))
                        .populate(12, new ItemStack(Material.BIRCH_PRESSURE_PLATE))
                        .populate(14, new ItemStack(Material.JUNGLE_PRESSURE_PLATE))
                        .populate(15, new ItemStack(Material.ACACIA_PRESSURE_PLATE))
                        .populate(16, new ItemStack(Material.DARK_OAK_PRESSURE_PLATE))
                        .populate(19, new ItemStack(Material.OAK_BUTTON))
                        .populate(20, new ItemStack(Material.SPRUCE_BUTTON))
                        .populate(21, new ItemStack(Material.BIRCH_BUTTON))
                        .populate(23, new ItemStack(Material.JUNGLE_BUTTON))
                        .populate(24, new ItemStack(Material.ACACIA_BUTTON))
                        .populate(25, new ItemStack(Material.DARK_OAK_BUTTON))
                        .populate(28, new ItemStack(Material.OAK_SAPLING))
                        .populate(29, new ItemStack(Material.SPRUCE_SAPLING))
                        .populate(30, new ItemStack(Material.BIRCH_SAPLING))
                        .populate(32, new ItemStack(Material.JUNGLE_SAPLING))
                        .populate(33, new ItemStack(Material.ACACIA_SAPLING))
                        .populate(34, new ItemStack(Material.DARK_OAK_SAPLING))
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
                0
        );
    }


}
