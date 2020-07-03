package com.github.polyrocketmatt.pencil.engine.geometry.vector;

/**
 * Created by PolyRocketMatt on 04/07/2020.
 *
 * @immutable abstraction of a 2 dimensional vector.
 */
public class Vector2 extends Vector3 {

    /**
     * The constant unit vector in the x direction.
     */
    public static final Vector2 UNIT_X = new Vector2(1, 0);
    /**
     * The constant unit vector in the y direction.
     */
    public static final Vector2 UNIT_Y = new Vector2(0, 1);
    /**
     * The constant unit vector.
     */
    public static final Vector2 UNIT = new Vector2(1, 1);
    /**
     * The constant zero vector in the x direction.
     */
    public static final Vector2 ZERO = new Vector2(0, 0);

    private final float x;
    private final float z;

    /**
     * Instantiates a new Vector.
     *
     * @param x the x
     * @param z the z
     */
    public Vector2(int x, int z) {
        super(x, 0, z);

        this.x = x;
        this.z = z;
    }

    /**
     * Instantiates a new Vector.
     *
     * @param x the x
     * @param z the z
     */
    public Vector2(float x, float z) {
        super(x, 0, z);

        this.x = x;
        this.z = z;
    }

}
