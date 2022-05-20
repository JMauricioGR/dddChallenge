package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceTime;

public class ServiceTimeUpdated extends DomainEvent {
    private final ServiceId serviceId;
    private final ServiceTime serviceTime;

    public ServiceTimeUpdated(ServiceId serviceId, ServiceTime serviceTime) {
        super("sofka.bathandcare.servicetimeupdated");
        this.serviceId = serviceId;
        this.serviceTime = serviceTime;
    }

    public ServiceTime getServiceTime() {
        return serviceTime;
    }

    public ServiceId getServiceId() {
        return serviceId;
    }
}
