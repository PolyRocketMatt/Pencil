package com.github.polyrocketmatt.pencil.engine.command;

import com.github.polyrocketmatt.pencil.engine.Pencil;
import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.utils.DataDump;
import org.bukkit.command.CommandSender;

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
        Pencil.getMessageService().messagePencilPlayer(player, onCommand());
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        Pencil.getMessageService().messageSender(sender, onCommand());
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
