package com.github.polyrocketmatt.pencil.engine.gui.action;

import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocketmatt.pencil.engine.exception.PencilException;
import com.github.polyrocketmatt.pencil.engine.utils.ExceptionReport;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */

public class CloseInventoryAction implements Action {

    public CloseInventoryAction(Object... actionObjects) { trigger(actionObjects); }

    public CloseInventoryAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 1)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(), "Too many arguments"),
                    actionObjects

            );
        if (!(actionObjects[0] instanceof PencilPlayer))
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(),
                            "Expected PencilPlayer argument [0], found " + actionObjects[0].getClass().toString()),
                    actionObjects[0]
            );

        ((PencilPlayer) actionObjects[0]).clearInventoryStatus();
    }
}
