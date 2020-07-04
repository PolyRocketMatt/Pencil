package com.github.polyrocketmatt.pencil.engine.gui.action;

import com.github.polyrocketmatt.pencil.engine.PencilPlayer;
import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocketmatt.pencil.engine.exception.PencilException;
import com.github.polyrocketmatt.pencil.engine.gui.inventories.AbstractInventory;
import com.github.polyrocketmatt.pencil.engine.gui.inventories.CustomInventory;
import com.github.polyrocketmatt.pencil.engine.gui.PlayerInventory;
import com.github.polyrocketmatt.pencil.engine.utils.ExceptionReport;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */

public class OpenInventoryAction implements InventoryAction {

    public OpenInventoryAction(Object... actionObjects) { trigger(actionObjects); }

    public OpenInventoryAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 2)
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
        if (!(actionObjects[1] instanceof AbstractInventory))
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.ACTION_TRIGGER_FAILURE, getClass().getName(),
                            "Expected AbstractInventory argument [1], found " + actionObjects[0].getClass().toString()),
                    actionObjects[0]
            );

        PencilPlayer player = (PencilPlayer) actionObjects[0];
        player.setInventory(new PlayerInventory(player.getInventory(), player, (CustomInventory) actionObjects[1]));
        player.getPlayer().openInventory(player.getInventory().getInventory().getInventory());
    }
}
