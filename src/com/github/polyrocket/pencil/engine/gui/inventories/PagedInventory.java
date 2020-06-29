package com.github.polyrocket.pencil.engine.gui.inventories;

import com.github.polyrocket.pencil.engine.exception.PencilException;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */

public class PagedInventory implements AbstractInventory, Iterable<CustomInventory> {

    private Map<Integer, CustomInventory> inventories;
    private int currentPage;

    public PagedInventory(List<CustomInventory> inventories) {
        this.inventories = new HashMap<>();
        this.currentPage = 0;
        for (int i = 0; i < inventories.size(); i++)
            this.inventories.put(i, inventories.get(i));
    }

    @Override
    public Iterator<CustomInventory> iterator() {
        return new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < inventories.size();
            }

            @Override
            public CustomInventory next() {
                return inventories.getOrDefault(index++, null);
            }
        };
    }

    @Override
    public Inventory getInventory() {
        return inventories.containsKey(currentPage) ? inventories.get(currentPage).getInventory(): inventories.get(0).getInventory();
    }

    public int getCurrentPage() {
        return currentPage;
    }

    private CustomInventory getInventoryAtPage(int page) {
        if (inventories.size() < page)
            throw new PencilException("[Pencil] >> Page for inventory search is out of bounds");
        return inventories.getOrDefault(page, null);
    }

    private int getPageForInventory(CustomInventory inventory) {
        if (inventory == null)
            throw new PencilException("[Pencil] >> Inventory for page search cannot be null");
        for (int key : inventories.keySet())
            if (inventories.get(key).getID() == inventory.getID())
                return key;
        return -1;
    }

    public CustomInventory next() {
        return getInventoryAtPage(++currentPage);
    }

    public CustomInventory previous() {
        return getInventoryAtPage(--currentPage);
    }

}
