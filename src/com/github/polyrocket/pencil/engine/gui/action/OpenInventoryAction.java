package com.github.polyrocket.pencil.engine.gui.action;

import com.github.polyrocket.pencil.engine.PencilPlayer;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.gui.inventories.AbstractInventory;
import com.github.polyrocket.pencil.engine.gui.inventories.CustomInventory;
import com.github.polyrocket.pencil.engine.gui.PlayerInventory;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */

public class OpenInventoryAction implements Action {

    public OpenInventoryAction(Object... actionObjects) { trigger(actionObjects); }

    public OpenInventoryAction() { /* Constructor does not need to initialize anything */ }

    @Override
    public void trigger(Object... actionObjects) {
        if (actionObjects.length != 2)
            throw new PencilException("[Pencil] >> Trigger for OpenInventoryAction failed: " + (actionObjects.length > 2 ?
                    "Too many arguments" : "Not enough arguments"));
        if (!(actionObjects[0] instanceof PencilPlayer))
            throw new PencilException("[Pencil] >> Trigger for OpenInventoryAction failed: Expected PencilPlayer argument [0]");
        if (!(actionObjects[1] instanceof AbstractInventory))
            throw new PencilException("[Pencil] >> Trigger for OpenInventoryAction failed: Expected AbstractInventory argument [1]");

        PencilPlayer player = (PencilPlayer) actionObjects[0];
        player.setInventory(new PlayerInventory(player.getInventory(), player, (CustomInventory) actionObjects[1]));
        player.getPlayer().openInventory(player.getInventory().getInventory().getInventory());
    }
}
