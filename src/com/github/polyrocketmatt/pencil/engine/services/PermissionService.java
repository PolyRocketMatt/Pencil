package com.github.polyrocketmatt.pencil.engine.services;

import com.github.polyrocketmatt.pencil.engine.Pencil;
import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.PermissionAttachment;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The type Permission service.
 */
public class PermissionService extends Service {

    private HashMap<PencilPlayer, PermissionAttachment> permissions;
    private HashMap<String, HashSet<String>> readStorage;

    /**
     * Instantiates a new Permission service.
     */
    public PermissionService() {
        super(5);
        this.permissions = new HashMap<>();
        this.readStorage = new HashMap<>();
    }

    @Override
    public int start() {
        linkPlayersPermissions(Pencil.getPlayerService().getPlayers().toArray(new PencilPlayer[Pencil.getPlayerService().getPlayers().size()]));
        return 0;
    }

    /**
     * Link players permissions.
     *
     * @param players the players
     */
    public void linkPlayersPermissions(PencilPlayer... players) {
        for (PencilPlayer player : players)
            linkPlayerPermissions(player);
    }

    /**
     * Link player permissions.
     *
     * @param player a PencilPlayer
     */
    public void linkPlayerPermissions(PencilPlayer player) {
        readJson("filepath");
    }

    private void readJson(String filepath) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(filepath));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray array = (JSONArray) jsonObject.get("Permissions2");
            JSONObject permissions = (JSONObject) array.get(0);
            for (Object object: permissions.keySet()) {
                readStorage.put((String) object, (HashSet<String>) permissions.get(object));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, HashSet<String>> getReadStorage() {
        return readStorage;
    }

    public void clearReadStorage() {
        readStorage.clear();
    }

    public PermissionAttachment getPermissionAttachment(PencilPlayer player) {
        return permissions.get(player);
    }

    @Override
    public int stop() {
        permissions.clear();

        return 0;
    }

    @Override
    public String dump() {
        /* TODO: - Dump all players with their respective permissions in a concise format
         */
        return "";
    }
}