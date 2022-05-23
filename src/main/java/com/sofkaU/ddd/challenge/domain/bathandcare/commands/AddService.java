package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.*;

public class AddService extends Command {

    private final BathAndCareId bathAndCareId;
    protected final ServiceId entityId;
    protected final ServiceName serviceName;
    protected final ServiceTime serviceTime;
    protected final Price price;

    public AddService(BathAndCareId bathAndCareId, ServiceId entityId, ServiceName serviceName, ServiceTime serviceTime, Price price){
        this.bathAndCareId = bathAndCareId;
        this.entityId = entityId;
        this.serviceName = serviceName;
        this.serviceTime = serviceTime;
        this.price = price;
    }

    public BathAndCareId getBathAndCareId() {
        return bathAndCareId;
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
