package com.github.polyrocketmatt.pencil.engine.command;

import com.github.polyrocketmatt.pencil.engine.Pencil;
import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.factories.InventoryFactory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

public class Gui extends AbstractCommand{
    /**
     * Instantiates a new Abstract command.
     *
     * @param name the name
     * @param type the type
     */
    public Gui(String name, CommandType type) {
        super(name, type);
    }

    @Override
    public void onCommand(PencilPlayer player, String[] args) {
        player.getPlayer().openInventory(InventoryFactory.paginate(InventoryFactory.ROWS_6, Pencil.PREFIX + ChatColor.GOLD + "Wood")
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
                .getInventory());
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
