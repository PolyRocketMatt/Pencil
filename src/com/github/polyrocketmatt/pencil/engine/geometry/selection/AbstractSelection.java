package com.github.polyrocketmatt.pencil.engine.geometry.selection;

import com.github.polyrocketmatt.pencil.engine.geometry.vector.Vector3;

/**
 * Created by PolyRocketMatt on 04/07/2020.
 */
public abstract class AbstractSelection {

    private final Vector3 min;
    private final Vector3 max;

    /**
     * Instantiates a new Abstract selection.
     *
     * @param min the min
     * @param max the max
     */
    public AbstractSelection(Vector3 min, Vector3 max) {
        this.min = min;
        this.max = max;
    }

    /**
     * Gets minimum vector.
     *
     * @return the min
     */
    public Vector3 getMin() {
        return min;
    }

    /**
     * Gets maximum vector.
     *
     * @return the max
     */
    public Vector3 getMax() {
        return max;
    }

    /**
     * Gets the width of the selection.
     *
     * @return the width
     */
    public abstract int getWidth();

    /**
     * Gets the height of the selection.
     *
     * @return the height
     */
    public abstract int getHeight();

    /**
     * Gets the breath of the selection.
     *
     * @return the breath
     */
    public abstract int getBreath();

    /**
     * Gets the amount of blocks inside the selection.
     *
     * @return the blocks
     */
    public abstract int getBlocks();

    @Override
    public String toString() {
        return "AbstractSelection{" +
                "min=" + min.toString() +
                ", max=" + max.toString() +
                '}';
    }
}
