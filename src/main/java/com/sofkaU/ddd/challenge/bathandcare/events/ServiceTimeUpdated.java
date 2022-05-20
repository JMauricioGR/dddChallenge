package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceTime;

public class ServiceTimeUpdated extends DomainEvent {
    private final ServiceTime serviceTime;

    public ServiceTimeUpdated(ServiceTime serviceTime) {
        super("sofka.bathandcare.servicetimeupdated");
        this.serviceTime = serviceTime;
    }

    public ServiceTime getServiceTime() {
        return serviceTime;
    }
}
