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
