package com.github.polyrocket.pencil.engine.defaults;

import java.text.MessageFormat;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */

public class DefaultStrings {

    public static final String CONSOLE_PREFIX = "[Pencil] >> ";

    public static final String CANNOT_BE_NULL = CONSOLE_PREFIX + "{0} cannot be null";
    public static final String ACTION_TRIGGER_FAILURE = CONSOLE_PREFIX + "Trigger for {0} failed: {1}";
    public static final String UNEXPECTED_SERVICE_WITH_ID = "Unexpected service using ID: {0}";
    public static final String NON_EXISTING_SERIVE_WITH_ID = "Service with ID {0} does not exist";

    public static final String LANGUAGE_URL = "https://script.google.com/macros/s/AKfycbz7e4FuRVf-DnW-4JS2kl5jG1HA6DcF0STIpZqLRMqJSdgIaZCa/exec";

    public static String format(String str, Object... objects) { return MessageFormat.format(str, objects); }

}
