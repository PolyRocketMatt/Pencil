package com.polyrocket.pencil.engine.command;

import com.polyrocket.pencil.engine.PencilPlayer;
import org.bukkit.command.CommandSender;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 * Abstraction that stores information for
 * the {@link com.polyrocket.pencil.engine.managers.CommandManager}
 * to use.
 *
 * @invar getName() != null
 * @invar getType() != null
 */

public abstract class AbstractCommand {

    /**
     * Commands can either be a console-only command or a player-only command
     */
    public enum CommandType {
        CONSOLE, PLAYER
    }

    /**
     * Instance fields that store necessary information about the command.
     *
     * @invar name != null
     * @invar type != null
     */
    private String name;
    private CommandType type;

    /**
     * Creates a new Command.
     *
     * @mutates | this
     *
     * @throws IllegalArgumentException if {@code name} is {@code null}
     *      | name == null
     * @throws IllegalArgumentException if {@code type} is {@code null}
     *      | type == null
     * @post the name of the command is the given name
     *      | this.name == name
     * @post the type of the command is the given type
     *      | this.type == type
     * @param name the name of the command
     * @param type the type of the command
     */
    public AbstractCommand(String name, CommandType type) {
        if (name == null)
            throw new IllegalArgumentException("[Pencil] >> Name of a command cannot be null at instantiation of a command");
        if (type == null)
            throw new IllegalArgumentException("[Pencil] >> Type of a command cannot be null at instantiation of a command");
        this.name = name;
        this.type = type;
    }

    public abstract void onCommand(PencilPlayer player, String[] args);

    public abstract void onCommand(CommandSender sender, String[] args);

    public abstract String getHelp();

    public abstract int getArguments();

    /**
     * @inspects | this
     * @return the name of the command
     */
    public String getName() {
        return name;
    }

    /**
     * @inspects | this
     * @return the type of the command
     */
    public CommandType getType() {
        return type;
    }

}
