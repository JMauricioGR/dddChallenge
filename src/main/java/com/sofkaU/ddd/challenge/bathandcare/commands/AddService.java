package com.sofkaU.ddd.challenge.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceName;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceTime;

public class AddService extends Command {

    protected final ServiceId entityId;
    protected final ServiceName serviceName;
    protected final ServiceTime serviceTime;
    protected final Price price;

    public AddService(ServiceId entityId, ServiceName serviceName, ServiceTime serviceTime, Price price){

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
