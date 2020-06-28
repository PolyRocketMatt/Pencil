package com.polyrocket.pencil.engine.managers;

import com.polyrocket.pencil.engine.Dumpable;
import com.polyrocket.pencil.engine.exception.PencilException;
import com.polyrocket.pencil.engine.services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by PolyRocketMatt on 27/06/2020.
 */

public class ServiceManager implements Dumpable {

    private List<Service> services;

    public ServiceManager() {
        services = new ArrayList<>();
    }

    @Override
    public String dump() {
        return services.stream()
                .map(Service::toString)
                .collect(Collectors.joining(", "));
    }

    public void register(Service service) {
        if (!contains(service.getID()))
            services.add(service);
        else
            throw new PencilException("[Pencil] >> Service with ID " + service.getID() + " has already been assigned!");
    }

    private boolean contains(int ID) {
        return services.stream().anyMatch(service -> service.getID() == ID);
    }

    public void remove(int ID) {
        services.removeIf(service -> service.getID() == ID);
    }

    public Service get(int ID) {
        return services.stream().filter(service -> service.getID() == ID).findFirst().orElse(null);
    }

    public List<Service> getServices() {
        return new ArrayList<>(services);
    }
}
