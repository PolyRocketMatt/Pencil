package com.polyrocket.pencil.engine;

import com.polyrocket.pencil.engine.exception.PencilException;
import com.polyrocket.pencil.engine.managers.CommandManager;
import com.polyrocket.pencil.engine.managers.ServiceManager;
import com.polyrocket.pencil.engine.services.EventService;
import com.polyrocket.pencil.engine.services.MessageService;
import com.polyrocket.pencil.engine.services.PlayerService;
import com.polyrocket.pencil.engine.services.Service;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 * Main entry point of Pencil that stores
 * all necessary managers, utilities, etc.
 */
public class Pencil extends JavaPlugin {

    private static ServiceManager serviceManager;

    @Override
    public void onEnable() {
        System.out.println("[Pencil] >> Loading Pencil...");
        System.out.println("[Pencil] >> Loading services...");
        serviceManager = new ServiceManager();
        serviceManager.registerService(new MessageService());
        serviceManager.registerService(new PlayerService());
        serviceManager.registerService(new EventService());
        serviceManager.getServices().forEach(Service::start);

        System.out.println("[Pencil] >> Managing commands...");
        Objects.requireNonNull(getCommand("pencil")).setExecutor(new CommandManager());

        System.out.println("[Pencil] >> Pencil has been successfully loaded!");
    }

    @Override
    public void onDisable() {
        System.out.println("[Pencil] >> Unloading Pencil...");
        System.out.println("[Pencil] >> Unloading services...");

        getPlayerService().removePlayers(Bukkit.getOnlinePlayers().toArray(new Player[Bukkit.getOnlinePlayers().size()]));

        serviceManager.getServices().forEach(service -> serviceManager.removeService(service.getID()));

        System.out.println("[Pencil] >> Pencil has been successfully unloaded!");
    }

    /**
     * Gets plugin.
     *
     * @return the plugin
     */
    public static Plugin getPlugin() {
        return Bukkit.getServer().getPluginManager().getPlugin("Pencil");
    }

    /**
     * Gets service manager.
     *
     * @return the service manager
     */
    public static ServiceManager getServiceManager() {
        return serviceManager;
    }

    /**
     * Gets message service.
     *
     * @return the message service
     */
    public static MessageService getMessageService() {
        if (!(serviceManager.getServiceWithID(0) instanceof MessageService))
            throw new PencilException("[Pencil] >> Unexpected service using ID: 0! It's advised to make a complete dump and contact a developer!");
        if (serviceManager.getServiceWithID(0) == null)
            throw new PencilException("[Pencil] >> Unexpected error: service doesn't exist! It's advised to make a complete dump and contact a developer!");
        return (MessageService) serviceManager.getServiceWithID(0);
    }

    /**
     * Gets player service.
     *
     * @return the player service
     */
    public static PlayerService getPlayerService() {
        if (!(serviceManager.getServiceWithID(1) instanceof PlayerService))
            throw new PencilException("[Pencil] >> Unexpected service using ID: 1! It's advised to make a complete dump and contact a developer!");
        if (serviceManager.getServiceWithID(1) == null)
            throw new PencilException("[Pencil] >> Unexpected error: service doesn't exist! It's advised to make a complete dump and contact a developer!");
        return (PlayerService) serviceManager.getServiceWithID(1);
    }

    /**
     * Gets event service.
     *
     * @return the event service
     */
    public static EventService getEventService() {
        if (!(serviceManager.getServiceWithID(2) instanceof EventService))
            throw new PencilException("[Pencil] >> Unexpected service using ID: 2! It's advised to make a complete dump and contact a developer!");
        if (serviceManager.getServiceWithID(2) == null)
            throw new PencilException("[Pencil] >> Unexpected error: service doesn't exist! It's advised to make a complete dump and contact a developer!");
        return (EventService) serviceManager.getServiceWithID(2);
    }

    /**
     * The constant PREFIX used for all in-game Pencil messages.
     */
    public static String PREFIX = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Pencil" + ChatColor.DARK_GRAY + "] >> ";

}
