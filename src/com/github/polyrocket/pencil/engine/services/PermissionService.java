package com.github.polyrocket.pencil.engine.services;

import com.github.polyrocket.pencil.engine.PencilPlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

import java.util.Collection;
import java.util.HashMap;

/**
 * The type Permission service.
 */
public class PermissionService extends Service{
    private HashMap<PencilPlayer, PermissionAttachment> permissions;


    /**
     * Instantiates a new Permission service.
     */
    public PermissionService() {
        super(5);
        this.permissions = new HashMap<>();
    }

    @Override
    public int start() {
        PlayerService playerService = new PlayerService();
        linkPlayersPermissions(playerService.getPlayers().toArray(PencilPlayer[]::new));
        return 0;
    }

    /**
     * Link players permissions.
     *
     * @param players the players
     */
    public void linkPlayersPermissions(PencilPlayer...players) {
        for (PencilPlayer player : players) {
            linkPlayerPermissions(player);
        }
    }

    /**
     * Link player permissions.
     *
     * @param player a PencilPlayer
     */
    public void linkPlayerPermissions(PencilPlayer player) {
        /* TODO: - Read PermissionAttachment from JSON file
                 - add association player
         */

    }

    @Override
    public int stop() {
        return 0;
    }

    @Override
    public String dump() {
        return null;
    }
}
