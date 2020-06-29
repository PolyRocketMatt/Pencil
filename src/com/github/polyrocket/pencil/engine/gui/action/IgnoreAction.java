package com.github.polyrocket.pencil.engine.gui.action;

import com.github.polyrocket.pencil.engine.exception.PencilException;

/**
 * Created by PolyRocketMatt on 30/06/2020.
 */

public class IgnoreAction implements Action {

    public IgnoreAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 0)
            throw new PencilException("[Pencil] >> Trigger for BacktrackRoutineAction failed: IgnoreAction does not take arguments");
    }
}
