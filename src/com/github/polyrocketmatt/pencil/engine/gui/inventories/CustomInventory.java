package com.github.polyrocketmatt.pencil.engine.gui.inventories;

import com.github.polyrocketmatt.pencil.engine.gui.action.Action;
import com.github.polyrocketmatt.pencil.engine.gui.action.IgnoreAction;
import org.bukkit.inventory.Inventory;

import java.util.Map;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */
public class CustomInventory implements AbstractInventory {

    private static final IgnoreAction IGNORE_ACTION = new IgnoreAction();

    private final Map<Integer, Action> actionMap;
    private final Inventory inventory;
    private final String name;
    private final int rows;
    private final int columns;
    private final int id;

    /**
     * Instantiates a new custom inventory.
     *
     * @param actionMap the action map
     * @param inventory the inventory
     * @param name      the name
     * @param rows      the rows
     * @param columns   the columns
     * @param id        the id
     */
    public CustomInventory(Map<Integer, Action> actionMap, Inventory inventory, String name, int rows, int columns, int id) {
        this.actionMap = actionMap;
        this.inventory = inventory;
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        this.id = id;
    }

    /**
     * Gets action map.
     *
     * @return the action map
     */
    public Map<Integer, Action> getActionMap() {
        return actionMap;
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets rows.
     *
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * Gets columns.
     *
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getID() {
        return id;
    }

    /**
     * Trigger action when slot has been accessed.
     *
     * @param slot    the slot
     * @param objects the objects
     */
    public void trigger(int slot, Object...objects) {
        actionMap.getOrDefault(slot, IGNORE_ACTION).trigger(objects);
    }

}
