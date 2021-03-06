package com.polyrocket.pencil.engine.command;

import com.polyrocket.pencil.engine.PencilPlayer;
import com.polyrocket.pencil.engine.exception.PencilException;
import org.bukkit.command.CommandSender;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */
public abstract class AbstractCommand {

    /**
     * Commands can either be a console-only command or a player-only command.
     */
    public enum CommandType {
        /**
         * Console command type.
         */
        CONSOLE,
        /**
         * Player command type.
         */
        PLAYER
    }

    private String name;
    private CommandType type;

    /**
     * Instantiates a new Abstract command.
     *
     * @param name the name
     * @param type the type
     */
    public AbstractCommand(String name, CommandType type) {
        if (name == null)
            throw new PencilException("[Pencil] >> Name of a command cannot be null at instantiation of a command");
        if (type == null)
            throw new PencilException("[Pencil] >> Type of a command cannot be null at instantiation of a command");
        this.name = name;
        this.type = type;
    }

    /**
     * On command.
     *
     * @param player the player
     * @param args   the args
     */
    public abstract void onCommand(PencilPlayer player, String[] args);

    /**
     * On command.
     *
     * @param sender the sender
     * @param args   the args
     */
    public abstract void onCommand(CommandSender sender, String[] args);

    /**
     * Gets help.
     *
     * @return the help
     */
    public abstract String getHelp();

    /**
     * Gets arguments.
     *
     * @return the arguments
     */
    public abstract int getArguments();

    /**
     * Gets name.
     *
     * @return the name of the command
     * @inspects | this
     */
    public String getName() {
        return name;
    }

    /**
     * Gets type.
     *
     * @return the type of the command
     * @inspects | this
     */
    public CommandType getType() {
        return type;
    }

}
