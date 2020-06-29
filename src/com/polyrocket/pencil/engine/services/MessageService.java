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

    /**
     * Instantiates a new Message service.
     */
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

    /**
     * The enum Message type.
     */
    public enum MessageType {
        /**
         * Info message type.
         */
        INFO(ChatColor.GREEN),
        /**
         * Warning message type.
         */
        WARNING(ChatColor.YELLOW),
        /**
         * Error message type.
         */
        ERROR(ChatColor.RED);

        private ChatColor color;

        MessageType(ChatColor color) {
            this.color = color;
        }

        /**
         * Gets color.
         *
         * @return the color
         */
        public ChatColor getColor() {
            return color;
        }
    }

    /**
     * The constant INSUFFICIENT_PERMISSION.
     */
    public static String INSUFFICIENT_PERMISSION = MessageType.ERROR.color + "Oops! You don't have the permission to do that!";
    /**
     * The constant INSUFFICIENT_COMMAND.
     */
    public static String INSUFFICIENT_COMMAND = MessageType.WARNING.color + "Oops! Expected a command and optional arguments!";
    /**
     * The constant INSUFFICIENT_ARGUMENTS.
     */
    public static String INSUFFICIENT_ARGUMENTS = MessageType.WARNING.color + "Oops! Expected {0} arguments (found {1})!";
    /**
     * The constant ILLEGAL_ENTITY.
     */
    public static String ILLEGAL_ENTITY = MessageType.WARNING.color + "Oops! Seems like you are not a valid entity to do this!";
    /**
     * The constant NO_SUCH_COMMAND.
     */
    public static String NO_SUCH_COMMAND = MessageType.WARNING.color + "Oops! There is such command {0}!";

    /**
     * Message pencil player.
     *
     * @param player  the player
     * @param message the message
     */
    public void messagePencilPlayer(PencilPlayer player, String message) {
        player.getPlayer().sendMessage(PREFIX + message);
    }

    /**
     * Message pencil player.
     *
     * @param player    the player
     * @param type      the type
     * @param message   the message
     * @param arguments the arguments
     */
    public void messagePencilPlayer(PencilPlayer player, MessageType type, String message, Object...arguments) {
        messagePencilPlayer(player, type.color + MessageFormat.format(message, arguments));
    }

    /**
     * Message player.
     *
     * @param player  the player
     * @param message the message
     */
    public void messagePlayer(Player player, String message) {
        player.sendMessage(PREFIX + message);
    }

    /**
     * Message player.
     *
     * @param player    the player
     * @param type      the type
     * @param message   the message
     * @param arguments the arguments
     */
    public void messagePlayer(Player player, MessageType type, String message, Object...arguments) {
        messagePlayer(player, type.color + MessageFormat.format(message, arguments));
    }

    /**
     * Message sender.
     *
     * @param player  the player
     * @param message the message
     */
    public void messageSender(CommandSender player, String message) {
        player.sendMessage(PREFIX + message);
    }

    /**
     * Message sender.
     *
     * @param player    the player
     * @param type      the type
     * @param message   the message
     * @param arguments the arguments
     */
    public void messageSender(CommandSender player, MessageType type, String message, Object...arguments) {
        messageSender(player, type.color + MessageFormat.format(message, arguments));
    }

    @Override
    public String toString() {
        return "MessageService{}";
    }
}
