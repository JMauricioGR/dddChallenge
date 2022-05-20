package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceName;

public class ServiceNameUpdated extends DomainEvent {
    private final ServiceName serviceName;

    public ServiceNameUpdated(ServiceName serviceName) {
        super("sofka.bathandcare.servicenameupdated");
        this.serviceName = serviceName;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }
}
