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

    /**
     * Instantiates a new Service manager.
     */
    public ServiceManager() {
        services = new ArrayList<>();
    }

    @Override
    public String dump() {
        return services.stream()
                .map(Service::toString)
                .collect(Collectors.joining(", "));
    }

    /**
     * Register service.
     *
     * @param service the service
     */
    public void registerService(Service service) {
        if (service == null)
            throw new PencilException("[Pencil] >> Service cannot be null when registering");
        if (!containsService(service.getID()))
            services.add(service);
        else
            throw new PencilException("[Pencil] >> Service with ID " + service.getID() + " has already been assigned");
    }

    private boolean containsService(int ID) {
        return services.stream().anyMatch(service -> service.getID() == ID);
    }

    /**
     * Remove service.
     *
     * @param ID the id
     */
    public void removeService(int ID) {
        services.removeIf(service -> service.getID() == ID);
    }

    /**
     * Gets service with id.
     *
     * @param ID the id
     * @return the service with id
     */
    public Service getServiceWithID(int ID) {
        return services.stream().filter(service -> service.getID() == ID).findFirst().orElse(null);
    }

    /**
     * Gets services.
     *
     * @return the services
     */
    public List<Service> getServices() {
        return new ArrayList<>(services);
    }
}
