package com.github.polyrocketmatt.pencil.engine.utils;

import com.github.polyrocketmatt.pencil.engine.Pencil;

import java.io.*;

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

    public static boolean generateDump(String path, Object... objects) {
        try {
            System.out.println("[Pencil] >> Initiating data dump...");
            File file = new File(Pencil.getPlugin().getDataFolder() + "/dumps/", path);

            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            for (Object object : objects) {
                writer.write(object.toString());
                writer.newLine();
            }

            writer.flush();
            writer.close();

            System.out.println("[Pencil] >> Data dump finished!");

            return true;
        } catch (IOException ex) {
            System.out.println("[Pencil] >> Data dump has failed. The following error has occurred: ");
            ex.printStackTrace();

            return false;
        }
    }

}
