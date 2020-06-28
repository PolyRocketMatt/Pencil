package com.polyrocket.pencil.engine.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static com.polyrocket.pencil.engine.Pencil.getPlayerService;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class ConnectionListener extends PencilListener {

    @Override
    public String getName() {
        return "ConnectionListener";
    }

    @EventHandler (priority = EventPriority.LOWEST)
    public void onConnect(PlayerJoinEvent event) {
        getPlayerService().addPlayer(event.getPlayer());
    }

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onDisconnect(PlayerQuitEvent event) {
        getPlayerService().removePlayer(event.getPlayer());
    }

}
