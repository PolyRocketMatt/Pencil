package com.github.polyrocket.pencil.engine.gui.action;

import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */

public class IgnoreAction implements Action {

    public IgnoreAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 0)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(), "Too many arguments"),
                    actionObjects
            );
    }
}
