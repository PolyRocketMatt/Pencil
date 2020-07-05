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
