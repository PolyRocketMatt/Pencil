package com.github.polyrocketmatt.pencil.engine.services;

import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocketmatt.pencil.engine.exception.PencilException;
import com.github.polyrocketmatt.pencil.engine.utils.ExceptionReport;
import com.github.polyrocketmatt.pencil.engine.utils.MiscellaneousUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */

public class ExceptionService extends Service {

    private Map<String, ExceptionReport> reports;

    public ExceptionService() {
        super(3);

        this.reports = new HashMap<>();
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
        return buildExceptionReport();
    }

    public void catchException(PencilException exception) {
        /* If the exception is null, it will ALWAYS be catched here
         *  avoiding infinite loops.
         */
        if (exception == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.MEDIUM,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, PencilException.class.getName())
            );
        reports.put(MiscellaneousUtils.now(), exception.getReport());
    }

    private String buildExceptionReport() {
        StringBuilder builder = new StringBuilder();
        String[] sortedDates = MiscellaneousUtils.sortDates(MiscellaneousUtils.toStringArray(reports.keySet()));

        for (String key : sortedDates) {
            ExceptionReport report = reports.get(key);
            Class<?> thrower = report.getException().getThrower();

            String stringReport = key + "\n"
                    + "An exception occurred. Exception was thrown in " + thrower.getName() + " at row " + report.getException().getRow() + "\n"
                    + report.toString();

            builder.append(stringReport).append("\n\n");
        }

        return builder.toString();
    }

}