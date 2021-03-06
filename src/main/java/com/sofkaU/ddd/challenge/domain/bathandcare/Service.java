package com.sofkaU.ddd.challenge.domain.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceTime;

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

    public void UpdateServiceName(ServiceName serviceName){
        this.serviceName = Objects.requireNonNull(serviceName);
    }

    public void UpdateServiceTime(ServiceTime serviceTime){
        this.serviceTime = Objects.requireNonNull(serviceTime);
    }

    public void UpdatePrice( Price price){
        this.price = Objects.requireNonNull(price);
    }

    public ServiceName serviceName() {
        return serviceName;
    }

    public ServiceTime serviceTime() {
        return serviceTime;
    }

    public Price price() {
        return price;
    }
}
