package com.github.polyrocketmatt.pencil.engine.geometry.selection;

import com.github.polyrocketmatt.pencil.engine.geometry.vector.Vector3;

/**
 * Created by PolyRocketMatt on 04/07/2020.
 */

public class RegularSelection extends AbstractSelection {

    private final int width;
    private final int height;
    private final int breath;

    public RegularSelection(Vector3 min, Vector3 max) {
        super(min, max);

        this.width = (int) (Math.max(min.getBlockX(), max.getBlockX()) - Math.min(min.getBlockX(), max.getBlockX()));
        this.height = (int) (Math.max(min.getBlockY(), max.getBlockY()) - Math.min(min.getBlockY(), max.getBlockY()));
        this.breath = (int) (Math.max(min.getBlockZ(), max.getBlockZ()) - Math.min(min.getBlockZ(), max.getBlockZ()));
    }

    @Override
    public Vector3 getMax() {
        return super.getMax();
    }

    @Override
    public Vector3 getMin() {
        return super.getMin();
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getBreath() {
        return breath;
    }

    @Override
    public int getBlocks() {
        return width * height * breath;
    }

    @Override
    public String toString() {
        return "RegularSelection{" +
                super.toString() +
                ", width=" + width +
                ", height=" + height +
                ", breath=" + breath +
                '}';
    }
}
