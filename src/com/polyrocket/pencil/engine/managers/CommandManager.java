package com.polyrocket.pencil.engine.managers;

import com.polyrocket.pencil.engine.PencilPlayer;
import com.polyrocket.pencil.engine.command.AbstractCommand;
import com.polyrocket.pencil.engine.command.DumpCommand;
import com.polyrocket.pencil.engine.exception.PencilException;
import com.polyrocket.pencil.engine.services.MessageService;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

import static com.polyrocket.pencil.engine.Pencil.getMessageService;
import static com.polyrocket.pencil.engine.Pencil.getPlayerService;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */
public class CommandManager implements CommandExecutor {

    private HashSet<AbstractCommand> commands;

    /**
     * Instantiates a new Command manager.
     */
    public CommandManager() {
        this.commands = new HashSet<>();
        this.commands.add(new DumpCommand("dump", AbstractCommand.CommandType.CONSOLE));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("pencil")) {
            if (args.length < 1) {
                getMessageService().messageSender(sender, MessageService.INSUFFICIENT_COMMAND);

                return true;
            } else {
                if (args[0].equalsIgnoreCase("help")) {
                    if (sender instanceof Player)
                        getCommandsOfType(AbstractCommand.CommandType.PLAYER).forEach(
                                command -> getMessageService().messageSender(sender, MessageService.MessageType.INFO, command.getName() + " - " + command.getHelp())
                        );
                    else
                        getCommandsOfType(AbstractCommand.CommandType.CONSOLE).forEach(
                                command -> getMessageService().messageSender(sender, MessageService.MessageType.INFO, command.getName() + " - " + command.getHelp())
                        );
                } else {
                    AbstractCommand command = commands.stream()
                            .filter(consoleCommand -> consoleCommand.getName().equalsIgnoreCase(args[0]))
                            .findFirst()
                            .orElse(null);
                    if (command == null) {
                        getMessageService().messageSender(sender, MessageService.MessageType.WARNING, MessageService.NO_SUCH_COMMAND, args[0]);

                        return true;
                    }

                    if (args.length - 1 < command.getArguments()) {
                        getMessageService().messageSender(sender,
                                MessageService.MessageType.WARNING,
                                MessageService.INSUFFICIENT_ARGUMENTS,
                                command.getArguments(),
                                args.length - 1
                        );

                        return true;
                    }

                    //TODO: Check permissions
                    if (command.getType() == AbstractCommand.CommandType.CONSOLE) {
                        command.onCommand(sender, Arrays.copyOfRange(args, 1, args.length));
                    } else {
                        if (!(sender instanceof Player)) {
                            getMessageService().messageSender(sender, MessageService.ILLEGAL_ENTITY);

                            return true;
                        }

                        PencilPlayer player = getPlayerService().getPlayer((Player) sender);

                        command.onCommand(player, Arrays.copyOfRange(args, 1, args.length));
                    }
                }
            }
        }

        return true;
    }

    private HashSet<AbstractCommand> getCommandsOfType(AbstractCommand.CommandType type) {
        if (type == null)
            throw new PencilException("[Pencil] >> Type cannot be null when accessing all commands of a type");

        return commands
                .stream()
                .filter(cmd -> cmd.getType() == type)
                .collect(Collectors.toCollection(HashSet::new));
    }
}
