package com.github.polyrocket.pencil.engine.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Set;

/**
 * Created by PolyRocketMatt on 28/06/2020.
 */

public class MiscellaneousUtils {

    private MiscellaneousUtils() {}

    private static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

    public static String now() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);

        return sdf.format(calendar.getTime());
    }

    public static String[] sortDates(String[] dates) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT_NOW);
        Arrays.sort(dates, Comparator.comparing(s -> LocalDateTime.parse(s, formatter)));

        return dates;
    }

    public static String[] toStringArray(Set<String> set) {
        return set.toArray(new String[set.size()]);
    }

}
