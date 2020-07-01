package com.github.polyrocketmatt.pencil.engine.listeners;

import org.bukkit.event.Listener;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */
public abstract class PencilListener implements Listener {

    /**
     * Gets name of the listener.
     *
     * @return the name of the listener
     */
    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}