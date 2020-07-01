package com.github.polyrocketmatt.pencil.engine.utils;

import com.github.polyrocketmatt.pencil.engine.Pencil;
import org.bukkit.util.io.BukkitObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */
public class DataDump implements Serializable {

    private static transient final long serialVersionUID = 2723283690961133500L;

    /**
     * Dump boolean.
     *
     * @return the boolean
     */
    public static boolean dump() {
        boolean successfulDump = generateDump(MiscellaneousUtils.now() + ".dmp", Pencil.getServiceManager().dump());
        if (successfulDump)
            System.out.println("[Pencil] >> Data dump has been completed!");
        else
            System.out.println("[Pencil] >> Data dump has failed! Please contact a developer!");
        return successfulDump;
    }

    public static boolean generateDump(String file, Object... objects) {
        try {
            System.out.println("[Pencil] >> Initiating data dump...");
            BukkitObjectOutputStream out = new BukkitObjectOutputStream(new GZIPOutputStream(new FileOutputStream(file)));

            for (Object object : objects)
                out.writeObject(object.toString());

            out.close();
            System.out.println("[Pencil] >> Data dump finished!");

            return true;
        } catch (IOException ex) {
            System.out.println("[Pencil] >> Data dump has failed. The following error has occurred: ");
            ex.printStackTrace();

            return false;
        }
    }

}
