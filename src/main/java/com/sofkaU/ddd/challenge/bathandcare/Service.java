package com.sofkaU.ddd.challenge.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceName;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceTime;

import java.util.Objects;

public class Service extends Entity<ServiceId> {
    private ServiceName serviceName;
    private ServiceTime serviceTime;
    private Price price;

    public Service(ServiceId entityId, ServiceName serviceName, ServiceTime serviceTime, Price price){
        super(entityId);
        this.serviceName = serviceName;
        this.serviceTime = serviceTime;
        this.price = price;
    }

    public void UpdateServiceName(ServiceId serviceId, ServiceName serviceName){
        this.serviceName = Objects.requireNonNull(serviceName);
        this.entityId = Objects.requireNonNull(serviceId);
    }

    public void UpdateServiceTime(ServiceId serviceId, ServiceTime serviceTime){
        this.serviceTime = Objects.requireNonNull(serviceTime);
        this.entityId = Objects.requireNonNull(serviceId);
    }

    public void UpdatePrice(ServiceId serviceId, Price price){
        this.price = Objects.requireNonNull(price);
        this.entityId = Objects.requireNonNull(serviceId);
    }

    public Service(ServiceId entityId) {
        super(entityId);
    }
}
