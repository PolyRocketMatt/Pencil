package com.github.polyrocketmatt.pencil.engine.gui.inventories;

import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocketmatt.pencil.engine.exception.PencilException;
import com.github.polyrocketmatt.pencil.engine.utils.ExceptionReport;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by PolyRocketMatt on 29/06/2020.
 */

public class PagedInventory implements AbstractInventory, Iterable<CustomInventory> {

    private final Map<Integer, CustomInventory> inventories;
    private final int maxPages;
    private int currentPage;

    public PagedInventory(List<CustomInventory> inventories) {
        this.inventories = new HashMap<>();
        this.currentPage = 0;
        for (int i = 0; i < inventories.size(); i++)
            this.inventories.put(i, inventories.get(i));
        this.maxPages = inventories.size();
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
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format("Page {0} is out of bounds, maximum page is {1}", page, inventories.size())
            );
        return inventories.getOrDefault(page, null);
    }

    private int getPageForInventory(CustomInventory inventory) {
        if (inventory == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Inventory")
            );
        for (int key : inventories.keySet())
            if (inventories.get(key).getID() == inventory.getID())
                return key;
        return -1;
    }

    public CustomInventory next() {
        if (currentPage == maxPages) {
            currentPage = 0;

            return getInventoryAtPage(currentPage);
        } else
            return getInventoryAtPage(++currentPage);
    }

    public CustomInventory previous() {
        if (currentPage == 0) {
            currentPage = maxPages;

            return getInventoryAtPage(currentPage);
        } else
            return getInventoryAtPage(--currentPage);
    }

}
