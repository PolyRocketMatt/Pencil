package com.polyrocket.pencil.engine.command;

import com.polyrocket.pencil.engine.PencilPlayer;
import org.bukkit.command.CommandSender;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */

public abstract class AbstractCommand {

    public enum CommandType {
        CONSOLE, PLAYER
    }

    private String name;
    private CommandType type;

    public AbstractCommand(String name, CommandType type) {
        this.name = name;
        this.type = type;
    }

    public abstract void onCommand(PencilPlayer player, String[] args);

    public abstract void onCommand(CommandSender sender, String[] args);

    public abstract String getHelp();

    public abstract int getArguments();

    public String getName() {
        return name;
    }

    public CommandType getType() {
        return type;
    }

}
