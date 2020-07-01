package com.github.polyrocket.pencil.engine.gui.action;

import com.github.polyrocket.pencil.engine.PencilPlayer;
import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */

public class BacktrackRoutineAction implements Action {

    public BacktrackRoutineAction(Object... actionObjects) { trigger(actionObjects); }

    public BacktrackRoutineAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 1)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(),
                            (actionObjects.length > 2 ? "Too many arguments" : "Not enough arguments")),
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
        PencilPlayer player = (PencilPlayer) actionObjects[0];

        new CloseInventoryAction().trigger(player);
        new OpenInventoryAction().trigger(player, player.getInventory().getInventory());
    }
}
