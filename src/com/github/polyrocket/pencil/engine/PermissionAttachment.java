package com.github.polyrocket.pencil.engine;


import com.github.polyrocket.pencil.engine.exception.PencilException;
import com.github.polyrocket.pencil.engine.utils.ExceptionReport;

import java.util.HashSet;

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
        return (String[]) permissions.toArray();
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
                    "The permission you are trying to set is null");
        if (permissions.contains(permission)) {
            return false;
        } else {
            permissions.add(permission);
            return true;
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
                    "The permission you are trying to unset is null");
        if (permissions.contains(permission)) {
            permissions.remove(permission);
            return true;
        } else {

            return false;
        }
    }

    /**
     * Has permission boolean.
     *
     * @param permission the permission
     * @return {@code true} if the permission is set. {@code false} otherwise
     */
    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }
}
