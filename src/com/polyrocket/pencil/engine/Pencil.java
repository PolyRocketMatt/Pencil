package com.polyrocket.pencil.engine;

import com.polyrocket.pencil.engine.exception.PencilException;
import com.polyrocket.pencil.engine.listeners.ConnectionListener;
import com.polyrocket.pencil.engine.managers.CommandManager;
import com.polyrocket.pencil.engine.managers.ServiceManager;
import com.polyrocket.pencil.engine.services.EventService;
import com.polyrocket.pencil.engine.services.MessageService;
import com.polyrocket.pencil.engine.services.PlayerService;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */

public class Pencil extends JavaPlugin {

    private static ServiceManager serviceManager;

    @Override
    public void onEnable() {
        System.out.println("[Pencil] >> Loading Pencil...");
        System.out.println("[Pencil] >> Loading services...");
        serviceManager = new ServiceManager();
        serviceManager.register(new MessageService());
        serviceManager.register(new PlayerService());
        serviceManager.register(new EventService());

        System.out.println("[Pencil] >> Mapping listeners...");
        getEventService().register(new ConnectionListener());

        System.out.println("[Pencil] >> Managing existing entities...");
        getPlayerService().addPlayers(Bukkit.getOnlinePlayers().toArray(new Player[Bukkit.getOnlinePlayers().size()]));

        System.out.println("[Pencil] >> Managing commands...");
        Objects.requireNonNull(getCommand("pencil")).setExecutor(new CommandManager());

        System.out.println("[Pencil] >> Pencil has been successfully loaded!");
    }

    @Override
    public void onDisable() {
        System.out.println("[Pencil] >> Unloading Pencil...");
        System.out.println("[Pencil] >> Unloading services...");

        getPlayerService().removePlayers(Bukkit.getOnlinePlayers().toArray(new Player[Bukkit.getOnlinePlayers().size()]));

        serviceManager.getServices().forEach(service -> serviceManager.remove(service.getID()));

        System.out.println("[Pencil] >> Pencil has been successfully unloaded!");
    }

    public static Plugin getPlugin() {
        return Bukkit.getServer().getPluginManager().getPlugin("Pencil");
    }

    public static ServiceManager getServiceManager() {
        return serviceManager;
    }

    public static MessageService getMessageService() {
        if (!(serviceManager.get(0) instanceof MessageService))
            throw new PencilException("[Pencil] >> Unexpected service using ID: 0! It's advised to make a complete dump and contact a developer!");
        if (serviceManager.get(0) == null)
            throw new PencilException("[Pencil] >> Unexpected error: service doesn't exist! It's advised to make a complete dump and contact a developer!");
        return (MessageService) serviceManager.get(0);
    }

    public static PlayerService getPlayerService() {
        if (!(serviceManager.get(1) instanceof PlayerService))
            throw new PencilException("[Pencil] >> Unexpected service using ID: 1! It's advised to make a complete dump and contact a developer!");
        if (serviceManager.get(1) == null)
            throw new PencilException("[Pencil] >> Unexpected error: service doesn't exist! It's advised to make a complete dump and contact a developer!");
        return (PlayerService) serviceManager.get(1);
    }

    public static EventService getEventService() {
        if (!(serviceManager.get(2) instanceof EventService))
            throw new PencilException("[Pencil] >> Unexpected service using ID: 2! It's advised to make a complete dump and contact a developer!");
        if (serviceManager.get(2) == null)
            throw new PencilException("[Pencil] >> Unexpected error: service doesn't exist! It's advised to make a complete dump and contact a developer!");
        return (EventService) serviceManager.get(2);
    }

    public static String PREFIX = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Pencil" + ChatColor.DARK_GRAY + "] >> ";

}
