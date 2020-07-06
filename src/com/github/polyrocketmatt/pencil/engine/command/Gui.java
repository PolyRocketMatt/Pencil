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
    // TODO: remove command
    @Override
    public void onCommand(PencilPlayer player, String[] args) {
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
