package com.sofkaU.ddd.challenge.domain.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceTime;

import java.util.Objects;

public class Service extends Entity<ServiceId> {
    protected ServiceName serviceName;
    protected ServiceTime serviceTime;
    protected Price price;

    public Service(ServiceId serviceId, ServiceName serviceName, ServiceTime serviceTime, Price price){
        super(serviceId);
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

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
