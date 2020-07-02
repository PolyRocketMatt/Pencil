package com.github.polyrocket.pencil.engine;


import com.github.polyrocket.pencil.engine.defaults.DefaultStrings;
import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;
import joptsimple.internal.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * The type Permission attachment.
 */
public class PermissionAttachment {
    private HashSet<String> permissions;

    /**
     * Instantiates a new Permission attachment.
     */
    public PermissionAttachment() {
        permissions = new HashSet<>();
    }

    /**
     * Get permissions string [ ].
     *
     * @return an array of strings. The strings are the permissions.
     */
    public String[] getPermissions() {
        return permissions.toArray(new String[permissions.size()]);
    }

    /**
     * Sets permission.
     *
     * @param permission the permission
     * @return {@code true} if the permission has been added to the permissions and {@code false} if the permission was already added
     */
    public boolean setPermission(String permission) {
        if (permission == null)
            throw new PencilException(
                    this.getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.MEDIUM,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Permission"));
        if (!hasExactPermission(permission)) {
            permissions.add(permission);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Unset permission boolean.
     *
     * @param permission the permission
     * @return {@code true} if the permission has been removed from the permissions and {@code false} if the permission was already unset
     */
    public boolean unsetPermission(String permission) {
        if (permission == null)
            throw new PencilException(
                    this.getClass(),
                    ExceptionReport.ExceptionType.INTERNALLY_RELATED,
                    ExceptionReport.Severity.MEDIUM,
                    DefaultStrings.format(DefaultStrings.CANNOT_BE_NULL, "Permission"));
        if (hasExactPermission(permission)) {
            permissions.remove(permission);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Has exact permission boolean.
     *
     * @param permission the permission
     * @return {@code true} if the exact permission is set. {@code false} otherwise.
     */
    public boolean hasExactPermission(String permission) {
        return permissions.contains(permission);
    }

    /**
     * Has permission boolean.
     *
     * @param permission the permission
     * @return {@code true} if the exact permission or one of the parent permissions is set. {@code false} otherwise.
     */
    public boolean hasPermission(String permission) {
        return Arrays.stream(generatePermissionParents(permission)).anyMatch(i -> permissions.contains(i));
    }

    private String[] generatePermissionParents(String permission) {
        String[] splits = permission.split("\\.");
        for (int i = 1; i < splits.length; i++) {
            splits[i] = String.join(".", splits[i - 1], splits[i]);
        }
        return splits;
    }

}
