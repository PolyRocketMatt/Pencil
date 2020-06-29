package com.polyrocket.pencil.engine.utils;

import com.polyrocket.pencil.engine.Pencil;
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
        boolean successfulDump = generateFile(MiscellaneousUtils.now() + ".dmp");
        if (successfulDump)
            System.out.println("[Pencil] >> Data dump has been completed!");
        else
            System.out.println("[Pencil] >> Data dump has failed! Please contact a developer!");
        return successfulDump;
    }

    private static boolean generateFile(String file) {
        String serviceDump = Pencil.getServiceManager().dump();

        try {
            System.out.println("[Pencil] >> Initiating data dump...");
            BukkitObjectOutputStream out = new BukkitObjectOutputStream(new GZIPOutputStream(new FileOutputStream(file)));
            out.writeObject(serviceDump);
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
