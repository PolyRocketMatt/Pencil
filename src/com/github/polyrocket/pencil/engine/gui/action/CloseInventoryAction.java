package com.github.polyrocket.pencil.engine.gui.action;

import com.github.polyrocket.pencil.engine.PencilPlayer;
import com.github.polyrocket.pencil.engine.exception.PencilException;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */

public class CloseInventoryAction implements Action {

    public CloseInventoryAction(Object... actionObjects) { trigger(actionObjects); }

    public CloseInventoryAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 1)
            throw new PencilException("[Pencil] >> Trigger for CloseInventoryAction failed: Too many arguments");
        if (!(actionObjects[0] instanceof PencilPlayer))
            throw new PencilException("[Pencil] >> Trigger for CloseInventoryAction failed: Expected PencilPlayer argument");

        ((PencilPlayer) actionObjects[0]).clearInventoryStatus();
    }
}
