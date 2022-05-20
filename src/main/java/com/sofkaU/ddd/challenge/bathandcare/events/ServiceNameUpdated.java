package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceName;

public class ServiceNameUpdated extends DomainEvent {
    private final ServiceId serviceId;
    private final ServiceName serviceName;

    public ServiceNameUpdated(ServiceId serviceId,ServiceName serviceName) {
        super("sofka.bathandcare.servicenameupdated");
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }

    public ServiceId getServiceId() {
        return serviceId;
    }
}
