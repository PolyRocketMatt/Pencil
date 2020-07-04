package com.github.polyrocketmatt.pencil.engine.command;

import com.github.polyrocketmatt.pencil.engine.Pencil;
import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.defaults.DefaultItems;
import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import org.bukkit.command.CommandSender;

/**
 * Created by PolyRocketMatt on 04/07/2020.
 */

public class WandCommand extends AbstractCommand {

    public WandCommand(String name, CommandType type) {
        super(name, type);
    }

    @Override
    public void onCommand(PencilPlayer player, String[] args) {
        player.getPlayer().getInventory().addItem(DefaultItems.WAND);

        Pencil.getMessageService().messagePencilPlayer(player, "You have received the Pencil Wand!");
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        Pencil.getMessageService().messageSender(sender, DefaultStrings.format(DefaultStrings.UNEXPECTED_USER_TYPE));
    }

    @Override
    public String getHelp() {
        return "Gives the player the Pencil Wand.";
    }

    @Override
    public int getArguments() {
        return 0;
    }
}
