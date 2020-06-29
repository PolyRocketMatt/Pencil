package com.polyrocket.pencil.engine.services;

import com.polyrocket.pencil.engine.Dumpable;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */
public abstract class Service implements Dumpable {

    private int ID;

    /**
     * Instantiates a new Service.
     *
     * @param ID the id
     */
    public Service(int ID) {
        this.ID = ID;
    }

    /**
     * Start service.
     *
     * @return the int
     */
    public abstract int start();

    /**
     * Stop service.
     *
     * @return the int
     */
    public abstract int stop();

    /**
     * Gets id of the service.
     *
     * @return the id
     */
    public int getID() {
        return ID;
    }
}
