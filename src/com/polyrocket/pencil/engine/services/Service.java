package com.polyrocket.pencil.engine.services;

import com.polyrocket.pencil.engine.Dumpable;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */

public abstract class Service implements Dumpable {

    private int ID;

    public Service(int ID) {
        this.ID = ID;
    }

    public abstract int start();

    public abstract int stop();

    public int getID() {
        return ID;
    }
}
