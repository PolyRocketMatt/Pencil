package com.github.polyrocket.pencil.engine.gui.action;

import com.github.polyrocket.pencil.engine.PencilPlayer;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.gui.inventories.PagedInventory;

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
            throw new PencilException("[Pencil] >> Trigger for PagingRoutineAction failed: " + (actionObjects.length > 2 ?
                    "Too many arguments" : "Not enough arguments"));
        if (!(actionObjects[0] instanceof PencilPlayer))
            throw new PencilException("[Pencil] >> Trigger for PagingRoutineAction failed: Expected PencilPlayer argument [0]");
        if (!(actionObjects[1] instanceof PagedInventory))
            throw new PencilException("[Pencil] >> Trigger for PagingRoutineAction failed: Expected PagingInventory argument [1]");
        if (!(actionObjects[2] instanceof PagingAction))
            throw new PencilException("[Pencil] >> Trigger for PagingRoutineAction failed: Expected PagingAction argument [2]");

        PencilPlayer player = (PencilPlayer) actionObjects[0];
        PagedInventory inventory = (PagedInventory) actionObjects[1];
        PagingAction pagingAction = (PagingAction) actionObjects[2];

        new CloseInventoryAction().trigger(player);
        new OpenInventoryAction().trigger(player, (pagingAction == PagingAction.NEXT) ? inventory.next() : inventory.previous());
    }
}
