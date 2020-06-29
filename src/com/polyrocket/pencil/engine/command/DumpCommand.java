package com.polyrocket.pencil.engine.command;

import com.polyrocket.pencil.engine.PencilPlayer;
import com.polyrocket.pencil.engine.utils.DataDump;
import org.bukkit.command.CommandSender;

import static com.polyrocket.pencil.engine.Pencil.getMessageService;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */
public class DumpCommand extends AbstractCommand {

    /**
     * Instantiates a new Dump command.
     *
     * @param name the name
     * @param type the type
     */
    public DumpCommand(String name, CommandType type) {
        super(name, type);
    }

    @Override
    public void onCommand(PencilPlayer player, String[] args) {
        getMessageService().messagePencilPlayer(player, onCommand());
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        getMessageService().messageSender(sender, onCommand());
    }

    private String onCommand() {
        return DataDump.dump() ? "Data dump was successful!" : "Data dump has failed (Contact a developer)!";
    }

    @Override
    public String getHelp() {
        return "Creates a dump file (used by developers for bug-fixing).";
    }

    @Override
    public int getArguments() {
        return 0;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public CommandType getType() {
        return super.getType();
    }
}
