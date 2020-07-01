package com.github.polyrocket.pencil.engine.utils;

import com.github.polyrocket.pencil.engine.exception.PencilException;

import java.util.Arrays;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */
public class ExceptionReport {

    /**
     * The enum Severity.
     */
    public enum Severity {
        /**
         * Low severity.
         */
        LOW("Low"),
        /**
         * Medium severity.
         */
        MEDIUM("Medium"),
        /**
         * High severity.
         */
        HIGH("High"),
        /**
         * Critical severity.
         */
        CRITICAL("Critical");

        private String severity;

        Severity(String severity) {
            this.severity = severity;
        }

        /**
         * Gets severity.
         *
         * @return the severity
         */
        public String getSeverity() {
            return severity;
        }
    }

    /**
     * The enum Exception type.
     */
    public enum ExceptionType {
        /**
         * Bug related exception type.
         */
        BUG_RELATED,
        /**
         * Player related exception type.
         */
        PLAYER_RELATED,
        /**
         * Server related exception type.
         */
        SERVER_RELATED,

        /**
         * Internally related exception type.
         */
        INTERNALLY_RELATED
    }

    private PencilException exception;
    private ExceptionType type;
    private Severity severity;
    private String actualError;
    private String timeStamp;
    private Object[] informativeObjects;

    /**
     * Instantiates a new Exception report.
     *
     * @param exception          the exception
     * @param type               the type
     * @param severity           the severity
     * @param actualError        the actual error
     * @param timeStamp          the time stamp
     * @param informativeObjects the informative objects
     */
    public ExceptionReport(PencilException exception, ExceptionType type, Severity severity, String actualError, String timeStamp, Object... informativeObjects) {
        this.exception = exception;
        this.type = type;
        this.severity = severity;
        this.actualError = actualError;
        this.timeStamp = timeStamp;
        this.informativeObjects = informativeObjects;
    }

    /**
     * Gets exception.
     *
     * @return the exception
     */
    public PencilException getException() {
        return exception;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public ExceptionType getType() {
        return type;
    }

    /**
     * Gets severity.
     *
     * @return the severity
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Gets actual error.
     *
     * @return the actual error
     */
    public String getActualError() {
        return actualError;
    }

    /**
     * Gets time stamp.
     *
     * @return the time stamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Get informative objects object [ ].
     *
     * @return the object [ ]
     */
    public Object[] getInformativeObjects() {
        return informativeObjects;
    }

    @Override
    public String toString() {
        return "ExceptionReport{" +
                "exception=" + exception + "\n" +
                ", type=" + type + "\n" +
                ", severity=" + severity + "\n" +
                ", actualError='" + actualError + "'" + "\n" +
                ", informativeObjects=" + Arrays.toString(informativeObjects) +
                '}';
    }
}
