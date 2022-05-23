package com.sofkaU.ddd.challenge.domain.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.*;

public class ServiceAdded extends DomainEvent {
    private final BathAndCareId bathAndCareId;
    private final ServiceId entityId;
    private final ServiceName serviceName;
    private final ServiceTime serviceTime;
    private final Price price;

    public ServiceAdded(BathAndCareId bathAndCareId,ServiceId entityId, ServiceName serviceName, ServiceTime serviceTime, Price price) {
        super("sofka.bathandcare.serviceadded");
        this.bathAndCareId = bathAndCareId;
        this.entityId = entityId;
        this.serviceName = serviceName;
        this.serviceTime = serviceTime;
        this.price = price;
    }

    public ServiceId getEntityId() {
        return entityId;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }

    public ServiceTime getServiceTime() {
        return serviceTime;
    }

    public Price getPrice() {
        return price;
    }
}
