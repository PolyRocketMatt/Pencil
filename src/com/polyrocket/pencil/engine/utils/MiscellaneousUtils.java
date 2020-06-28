package com.polyrocket.pencil.engine.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class MiscellaneousUtils {

    private static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

    public static String now() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);

        return sdf.format(calendar.getTime());
    }

}
