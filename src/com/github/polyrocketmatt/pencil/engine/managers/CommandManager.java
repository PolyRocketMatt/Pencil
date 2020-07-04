package com.github.polyrocketmatt.pencil.engine.managers;

import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.command.Gui;
import com.github.polyrocketmatt.pencil.engine.command.WandCommand;
import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocketmatt.pencil.engine.exception.PencilException;
import com.github.polyrocketmatt.pencil.engine.services.MessageService;
import com.github.polyrocketmatt.pencil.engine.command.AbstractCommand;
import com.github.polyrocketmatt.pencil.engine.command.DumpCommand;
import com.github.polyrocketmatt.pencil.engine.utils.ExceptionReport;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

import static com.github.polyrocketmatt.pencil.engine.Pencil.getMessageService;
import static com.github.polyrocketmatt.pencil.engine.Pencil.getPlayerService;

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
        this.commands.add(new WandCommand("wand", AbstractCommand.CommandType.PLAYER));
        this.commands.add(new Gui("gui", AbstractCommand.CommandType.PLAYER));
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("pencil")) {
            if (args.length < 1) {
                getMessageService().messageSender(sender, MessageService.INSUFFICIENT_COMMAND);

                return true;
            } else {
                if (args[0].equalsIgnoreCase("help")) {
                    if (args.length == 2 && args[1].equalsIgnoreCase("-a")) {
                        if (!(sender instanceof Player)) {
                            getCommandsOfType(AbstractCommand.CommandType.PLAYER).forEach(
                                    command -> getMessageService().messageSender(sender, MessageService.MessageType.INFO, command.getName() + " - " + command.getHelp())
                            );
                            getCommandsOfType(AbstractCommand.CommandType.CONSOLE).forEach(
                                    command -> getMessageService().messageSender(sender, MessageService.MessageType.INFO, command.getName() + " - " + command.getHelp())
                            );
                        }
                    } else
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
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Type")
            );

        return commands
                .stream()
                .filter(cmd -> cmd.getType() == type)
                .collect(Collectors.toCollection(HashSet::new));
    }
}
