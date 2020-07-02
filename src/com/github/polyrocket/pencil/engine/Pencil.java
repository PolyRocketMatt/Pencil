package com.github.polyrocket.pencil.engine;

import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.managers.CommandManager;
import com.github.polyrocket.pencil.engine.managers.ServiceManager;
import com.github.polyrocket.pencil.engine.metrics.Metrics;
import com.github.polyrocket.pencil.engine.services.*;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;
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
    private static Metrics metrics;

    //TODO: Make sure Permission Service is started before Player Service to not get any NPE's
    @Override
    public void onEnable() {
        System.out.println("[Pencil] >> Loading Pencil...");
        System.out.println("[Pencil] >> Loading services...");
        serviceManager = new ServiceManager();
        serviceManager.registerService(new MessageService());
        serviceManager.registerService(new PermissionService());
        serviceManager.registerService(new PlayerService());
        serviceManager.registerService(new EventService());
        serviceManager.registerService(new ExceptionService());
        serviceManager.getServices().forEach(Service::start);

        System.out.println("[Pencil] >> Managing commands...");
        Objects.requireNonNull(getCommand("pencil")).setExecutor(new CommandManager());

        System.out.println("[Pencil] >> Enabling metrics...");
        metrics = new Metrics(getPlugin(), 8037);

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
     * Gets metrics.
     *
     * @return the metrics
     */
    public static Metrics getMetrics() {
        return metrics;
    }

    /**
     * Gets message service.
     *
     * @return the message service
     */
    public static MessageService getMessageService() {
        if (!(serviceManager.getServiceWithID(0) instanceof MessageService))
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.UNEXPECTED_SERVICE_WITH_ID, 0, serviceManager.getServiceWithID(0).getClass().getSimpleName())
            );
        if (serviceManager.getServiceWithID(0) == null)
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Service with ID 0")
            );
        return (MessageService) serviceManager.getServiceWithID(0);
    }

    /**
     * Gets player service.
     *
     * @return the player service
     */
    public static PlayerService getPlayerService() {
        if (!(serviceManager.getServiceWithID(1) instanceof PlayerService))
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.UNEXPECTED_SERVICE_WITH_ID, 1, serviceManager.getServiceWithID(0).getClass().getSimpleName())
            );
        if (serviceManager.getServiceWithID(1) == null)
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Service with ID 1")
            );
        return (PlayerService) serviceManager.getServiceWithID(1);
    }

    /**
     * Gets event service.
     *
     * @return the event service
     */
    public static EventService getEventService() {
        if (!(serviceManager.getServiceWithID(2) instanceof EventService))
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.UNEXPECTED_SERVICE_WITH_ID, 2, serviceManager.getServiceWithID(0).getClass().getSimpleName())
            );
        if (serviceManager.getServiceWithID(2) == null)
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Service with ID 2")
            );
        return (EventService) serviceManager.getServiceWithID(2);
    }

    public static ExceptionService getExceptionService() {
        if (!(serviceManager.getServiceWithID(3) instanceof ExceptionService))
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.UNEXPECTED_SERVICE_WITH_ID, 3, serviceManager.getServiceWithID(0).getClass().getSimpleName())
            );
        if (serviceManager.getServiceWithID(3) == null)
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Service with ID 3")
            );
        return (ExceptionService) serviceManager.getServiceWithID(3);
    }

    public static LanguageService getLanguageService() {
        if (!(serviceManager.getServiceWithID(4) instanceof LanguageService))
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.UNEXPECTED_SERVICE_WITH_ID, 4, serviceManager.getServiceWithID(0).getClass().getSimpleName())
            );
        if (serviceManager.getServiceWithID(4) == null)
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Service with ID 4")
            );
        return (LanguageService) serviceManager.getServiceWithID(4);
    }

    public static PermissionService getPermissionService() {
        if (!(serviceManager.getServiceWithID(5) instanceof PermissionService))
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.UNEXPECTED_SERVICE_WITH_ID, 5, serviceManager.getServiceWithID(0).getClass().getSimpleName())
            );
        if (serviceManager.getServiceWithID(5) ==  null)
            throw new PencilException(
                    Pencil.class,
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Service with ID 5")
            );
        return (PermissionService) serviceManager.getServiceWithID(5);
    }

    /**
     * The constant PREFIX used for all in-game Pencil messages.
     */
    public static final String PREFIX = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Pencil" + ChatColor.DARK_GRAY + "] >> ";

}
