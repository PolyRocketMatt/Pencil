package com.polyrocket.pencil.engine.services;

import com.polyrocket.pencil.engine.PencilPlayer;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.text.MessageFormat;

import static com.polyrocket.pencil.engine.Pencil.PREFIX;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */

public class MessageService extends Service {

    public MessageService() {
        super(0);
    }

    @Override
    public int start() {
        return 0;
    }

    @Override
    public int stop() {
        return 0;
    }

    @Override
    public String dump() {
        return "";
    }

    public enum MessageType {
        INFO(ChatColor.GREEN),
        WARNING(ChatColor.YELLOW),
        ERROR(ChatColor.RED);

        private ChatColor color;

        MessageType(ChatColor color) {
            this.color = color;
        }

        public ChatColor getColor() {
            return color;
        }
    }

    public static String INSUFFICIENT_PERMISSION = MessageType.ERROR.color + "Oops! You don't have the permission to do that!";
    public static String INSUFFICIENT_COMMAND = MessageType.WARNING.color + "Oops! Expected a command and optional arguments!";
    public static String INSUFFICIENT_ARGUMENTS = MessageType.WARNING.color + "Oops! Expected {0} arguments (found {1})!";
    public static String ILLEGAL_ENTITY = MessageType.WARNING.color + "Oops! Seems like you are not a valid entity to do this!";
    public static String NO_SUCH_COMMAND = MessageType.WARNING.color + "Oops! There is such command {0}!";

    public void message(PencilPlayer player, String message) {
        player.getPlayer().sendMessage(PREFIX + message);
    }

    public void message(PencilPlayer player, MessageType type, String message, Object...arguments) {
        message(player, type.color + MessageFormat.format(message, arguments));
    }

    public void message(Player player, String message) {
        player.sendMessage(PREFIX + message);
    }

    public void message(Player player, MessageType type, String message, Object...arguments) {
        message(player, type.color + MessageFormat.format(message, arguments));
    }

    public void message(CommandSender player, String message) {
        player.sendMessage(PREFIX + message);
    }

    public void message(CommandSender player, MessageType type, String message, Object...arguments) {
        message(player, type.color + MessageFormat.format(message, arguments));
    }

    @Override
    public String toString() {
        return "MessageService{}";
    }
}
