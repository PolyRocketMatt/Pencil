package com.polyrocket.pencil.engine.services;

import com.polyrocket.pencil.engine.Pencil;
import com.polyrocket.pencil.engine.exception.PencilException;
import com.polyrocket.pencil.engine.listeners.PencilListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class EventService extends Service {

    private List<Listener> activeListeners;

    public EventService() {
        super(2);

        this.activeListeners = new ArrayList<>();
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
        return toString();
    }

    public void register(PencilListener listener) {
        if (activeListeners.stream().anyMatch(activeListener -> activeListener.hashCode() == listener.hashCode()))
            throw new PencilException("[Pencil] >> Listener with name " + listener.getName() + " has already been registered!");
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
