package com.github.polyrocket.pencil.engine.exception;

import com.github.polyrocket.pencil.engine.Pencil;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;
import com.github.polyrocket.pencil.engine.utils.MiscellaneousUtils;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */
public class PencilException extends RuntimeException {

    private final Class<?> thrower;
    private final ExceptionReport report;
    private final int row;

    /**
     * Instantiates a new Pencil exception.
     *
     * @param thrower            the thrower
     * @param type               the type
     * @param severity           the severity
     * @param message            the message
     * @param informativeObjects the informative objects
     */
    public PencilException(Class<?> thrower, ExceptionReport.ExceptionType type, ExceptionReport.Severity severity, String message, Object... informativeObjects) {
        super(message);
        this.thrower = thrower;
        this.report = new ExceptionReport(
                this,
                type,
                severity,
                message,
                MiscellaneousUtils.now(),
                informativeObjects
        );
        this.row = this.getStackTrace()[0].getLineNumber();

        Pencil.getExceptionService().catchException(this);
    }

    /**
     * Gets thrower.
     *
     * @return the thrower
     */
    public Class<?> getThrower() {
        return thrower;
    }

    /**
     * Gets report.
     *
     * @return the report
     */
    public ExceptionReport getReport() {
        return report;
    }

    /**
     * Gets row.
     *
     * @return the row
     */
    public int getRow() {
        return row;
    }
}
