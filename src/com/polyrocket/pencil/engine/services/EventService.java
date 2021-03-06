package com.polyrocket.pencil.engine.services;

import com.polyrocket.pencil.engine.Pencil;
import com.polyrocket.pencil.engine.exception.PencilException;
import com.polyrocket.pencil.engine.listeners.ConnectionListener;
import com.polyrocket.pencil.engine.listeners.PencilListener;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */
public class EventService extends Service {

    private List<PencilListener> activeListeners;

    /**
     * Instantiates a new Event service.
     */
    public EventService() {
        super(2);

        this.activeListeners = new ArrayList<>();
    }

    @Override
    public int start() {
        System.out.println("[Pencil] >> Mapping listeners...");
        registerListener(new ConnectionListener());

        return 0;
    }

    @Override
    public int stop() {
        System.out.println("[Pencil] >> Removing listeners...");
        activeListeners.clear();

        return 0;
    }

    @Override
    public String dump() {
        return toString();
    }

    /**
     * Register listener.
     *
     * @param listener the listener
     */
    public void registerListener(PencilListener listener) {
        if (listener == null)
            throw new PencilException("[Pencil] >> Listener cannot be null when registering");
        if (activeListeners.stream().anyMatch(ls -> ls.getName().equalsIgnoreCase(listener.getName())))
            throw new PencilException("[Pencil] >> Listener with name " + listener.getName() + " has already been registered");
        activeListeners.add(listener);

        Bukkit.getServer().getPluginManager().registerEvents(listener, Pencil.getPlugin());
    }

    @Override
    public String toString() {
        return "EventService{LISTENERS:" +
                activeListeners.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(", "))
                + "}";
    }
}
