package com.github.polyrocketmatt.pencil.engine.geometry.vector;

import com.github.polyrocketmatt.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocketmatt.pencil.engine.exception.PencilException;
import com.github.polyrocketmatt.pencil.engine.utils.ExceptionReport;

import java.util.Objects;

/**
 * Created by PolyRocketMatt on 03/07/2020.
 *
 * @immutable abstraction of a 3 dimensional vector.
 */
public class Vector3 {

    /**
     * The constant unit vector in the x direction.
     */
    public static final Vector3 UNIT_X = new Vector3(1, 0, 0);
    /**
     * The constant unit vector in the y direction.
     */
    public static final Vector3 UNIT_Y = new Vector3(0, 1, 0);
    /**
     * The constant unit vector in the z direction.
     */
    public static final Vector3 UNIT_Z = new Vector3(0, 0, 1);
    /**
     * The constant unit vector.
     */
    public static final Vector3 UNIT = new Vector3(1, 1, 1);
    /**
     * The constant zero vector in the x direction.
     */
    public static final Vector3 ZERO = new Vector3(0, 0, 0);

    private final float x;
    private final float y;
    private final float z;

    /**
     * Instantiates a new Vector.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Vector3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Instantiates a new Vector.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Gets the block-coordinate at x.
     *
     * @return the block x
     */
    public int getBlockX() {
        return (int) x;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * Gets the block-coordinate at y.
     *
     * @return the block y
     */
    public int getBlockY() {
        return (int) y;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * Gets the block-coordinate at z.
     *
     * @return the block z
     */
    public int getBlockZ() {
        return (int) z;
    }

    /**
     * Gets z.
     *
     * @return the z
     */
    public float getZ() {
        return z;
    }

    /**
     * Add another vector.
     *
     * @param x the x-addition
     * @param y the y-addition
     * @param z the z-addition
     * @return the vector
     */
    public Vector3 plus(int x, int y, int z) {
        return new Vector3(this.x + x, this.y + y, this.z + z);
    }

    /**
     * Add another vector.
     *
     * @param x the x-addition
     * @param y the y-addition
     * @param z the z-addition
     * @return the vector
     */
    public Vector3 plus(float x, float y, float z) {
        return new Vector3(this.x + x, this.y + y, this.z + z);
    }

    /**
     * Add another vector.
     *
     * @param n the n-addition
     * @return the vector
     */
    public Vector3 plus(int n) {
        return new Vector3(this.x + n, this.y + n, this.z + n);
    }

    /**
     * Add another vector.
     *
     * @param n the n-addition
     * @return the vector
     */
    public Vector3 plus(float n) {
        return new Vector3(this.x + n, this.y + n, this.z + n);
    }

    /**
     * Minus another vector.
     *
     * @param x the x-subtraction
     * @param y the y-subtraction
     * @param z the z-subtraction
     * @return the vector
     */
    public Vector3 minus(int x, int y, int z) {
        return new Vector3(this.x - x, this.y - y, this.z - z);
    }

    /**
     * Minus another vector.
     *
     * @param x the x-subtraction
     * @param y the y-subtraction
     * @param z the z-subtraction
     * @return the vector
     */
    public Vector3 minus(float x, float y, float z) {
        return new Vector3(this.x - x, this.y - y, this.z - z);
    }

    /**
     * Minus another vector.
     *
     * @param n the n-subtraction
     * @return the vector
     */
    public Vector3 minus(int n) {
        return new Vector3(this.x - n, this.y - n, this.z - n);
    }

    /**
     * Minus another vector.
     *
     * @param n the n-subtraction
     * @return the vector
     */
    public Vector3 minus(float n) {
        return new Vector3(this.x - n, this.y - n, this.z - n);
    }

    /**
     * Multiply another vector.
     *
     * @param x the x-multiplier
     * @param y the y-multiplier
     * @param z the z-multiplier
     * @return the vector
     */
    public Vector3 multiply(int x, int y, int z) {
        return new Vector3(this.x * x, this.y * y, this.z * z);
    }

    /**
     * Multiply another vector.
     *
     * @param x the x-multiplier
     * @param y the y-multiplier
     * @param z the z-multiplier
     * @return the vector
     */
    public Vector3 multiply(float x, float y, float z) {
        return new Vector3(this.x * x, this.y * y, this.z * z);
    }

    /**
     * Multiply another vector.
     *
     * @param n the n-multiplier
     * @return the vector
     */
    public Vector3 multiply(int n) {
        return new Vector3(this.x * n, this.y * n, this.z * n);
    }

    /**
     * Multiply another vector.
     *
     * @param n the n-multiplier
     * @return the vector
     */
    public Vector3 multiply(float n) {
        return new Vector3(this.x * n, this.y * n, this.z * n);
    }

    /**
     * Divide another vector.
     *
     * @param x the x-divisor
     * @param y the y-divisor
     * @param z the z-divisor
     * @return the vector
     */
    public Vector3 divide(int x, int y, int z) {
        return new Vector3(this.x / x, this.y / y, this.z / z);
    }

    /**
     * Divide another vector.
     *
     * @param x the x-divisor
     * @param y the y-divisor
     * @param z the z-divisor
     * @return the vector
     */
    public Vector3 divide(float x, float y, float z) {
        return new Vector3(this.x / x, this.y / y, this.z / z);
    }

    /**
     * Divide another vector.
     *
     * @param n the divisor
     * @return the vector
     */
    public Vector3 divide(int n) {
        return new Vector3(this.x / n, this.y / n, this.z / n);
    }

    /**
     * Divide another vector.
     *
     * @param n the divisor
     * @return the vector
     */
    public Vector3 divide(float n) {
        return new Vector3(this.x / n, this.y / n, this.z / n);
    }

    /**
     * Get the length of the vector.
     *
     * @return the float
     */
    public float length() {
        return (float) Math.sqrt(lengthSquared());
    }

    /**
     * Get the (int) length of the vector.
     *
     * @return the int
     */
    public int blockLength() {
        return (int) length();
    }

    /**
     * Get scalar product of the vector.
     *
     * @return the float
     */
    public float lengthSquared() {
        return x * x + y * y + z * z;
    }

    /**
     * Get the distance of the vector to another one.
     *
     * @param other the other
     * @return the float
     */
    public float distance(Vector3 other) {
        return (float) Math.sqrt(distanceSquared(other));
    }

    /**
     * Get the (int) distance of the vector to another one.
     *
     * @param other the other
     * @return the int
     */
    public int blockDistance(Vector3 other) {
        return (int) distance(other);
    }

    /**
     * Get the squared distance of the vector to another one.
     *
     * @param other the other
     * @return the float
     */
    public float distanceSquared(Vector3 other) {
        if (other == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Calculation Vector"),
                    this
            );
        float deltaX = other.x - x;
        float deltaY = other.y - y;
        float deltaZ = other.z - z;

        return deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
    }

    /**
     * Normalize vector.
     *
     * @return the vector
     */
    public Vector3 normalize() {
        return divide(length());
    }

    /**
     * Dot another vector.
     *
     * @param other the other
     * @return the vector
     */
    public Vector3 dot(Vector3 other) {
        if (other == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Calculation Vector"),
                    this
            );
        return new Vector3(other.x * x, other.y * y, other.z * z);
    }

    /**
     * Cross another vector.
     *
     * @param other the other
     * @return the vector
     */
    public Vector3 cross(Vector3 other) {
        if (other == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Calculation Vector"),
                    this
            );
        return new Vector3(
                y * other.z - z * other.y,
                z * other.x - x * other.z,
                x * other.y - y * other.x
        );
    }

    /**
     * Check if vector is contained within two points.
     *
     * @param min the min
     * @param max the max
     * @return the boolean
     */
    public boolean contained(Vector3 min, Vector3 max) {
        return x >= min.x && x <= max.x
                && y >= min.y && y <= max.y
                && z >= min.z && z <= max.z;
    }

    /**
     * Floor vector.
     *
     * @return the vector
     */
    public Vector3 floor() {
        return new Vector3((float) Math.floor(x), (float) Math.floor(y), (float) Math.floor(z));
    }

    /**
     * Ceil vector.
     *
     * @return the vector
     */
    public Vector3 ceil() {
        return new Vector3((float) Math.ceil(x), (float) Math.ceil(y), (float) Math.ceil(z));
    }

    /**
     * Round vector.
     *
     * @return the vector
     */
    public Vector3 round() {
        return new Vector3((float) Math.round(x), (float) Math.round(y), (float) Math.round(z));
    }

    /**
     * Absolute value vector.
     *
     * @return the vector
     */
    public Vector3 abs() {
        return new Vector3(Math.abs(x), Math.abs(y), Math.abs(z));
    }

    /**
     * To minimum component vector.
     *
     * @param other the other
     * @return the vector
     */
    public Vector3 toMinimumComponent(Vector3 other) {
        if (other == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Calculation Vector"),
                    this
            );
        return new Vector3(
                Math.min(other.x, x),
                Math.min(other.y, y),
                Math.min(other.z, z)
        );
    }

    /**
     * To maximum component vector.
     *
     * @param other the other
     * @return the vector
     */
    public Vector3 toMaximumComponent(Vector3 other) {
        if (other == null)
            throw new PencilException(
                    getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.CRITICAL,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Calculation Vector"),
                    this
            );
        return new Vector3(
                Math.max(other.x, x),
                Math.max(other.y, y),
                Math.max(other.z, z)
        );
    }

    /**
     * To vector 2D.
     *
     * @return the vec
     */
    public Vector2 toVector2D() {
        return new Vector2(this.x, this.z);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3 vector = (Vector3) o;
        return Float.compare(vector.x, x) == 0 &&
                Float.compare(vector.y, y) == 0 &&
                Float.compare(vector.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
