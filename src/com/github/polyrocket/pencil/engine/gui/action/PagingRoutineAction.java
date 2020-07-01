package com.github.polyrocket.pencil.engine.gui.action;

import com.github.polyrocket.pencil.engine.PencilPlayer;
import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.gui.inventories.PagedInventory;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */

public class PagingRoutineAction implements Action {

    public enum PagingAction {
        NEXT,
        PREVIOUS
    }

    public PagingRoutineAction(Object... actionObjects) { trigger(actionObjects); }

    public PagingRoutineAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 3)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(),
                            (actionObjects.length > 3 ? "Too many arguments" : "Not enough arguments")),
                    actionObjects
            );
        if (!(actionObjects[0] instanceof PencilPlayer))
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(),
                            "Expected AbstractInventory argument [0], found " + actionObjects[0].getClass().toString()),
                    actionObjects[0]
            );
        if (!(actionObjects[1] instanceof PagedInventory))
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(),
                            "Expected PagedInventory argument [1], found " + actionObjects[0].getClass().toString()),
                    actionObjects[0]
            );
        if (!(actionObjects[2] instanceof PagingAction))
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(),
                            "Expected PagingAction argument [2], found " + actionObjects[0].getClass().toString()),
                    actionObjects[0]
            );

        PencilPlayer player = (PencilPlayer) actionObjects[0];
        PagedInventory inventory = (PagedInventory) actionObjects[1];
        PagingAction pagingAction = (PagingAction) actionObjects[2];

        new CloseInventoryAction().trigger(player);
        new OpenInventoryAction().trigger(player, (pagingAction == PagingAction.NEXT) ? inventory.next() : inventory.previous());
    }
}
