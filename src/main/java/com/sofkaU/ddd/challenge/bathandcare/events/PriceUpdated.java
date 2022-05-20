package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;

public class PriceUpdated extends DomainEvent {
    private final ServiceId serviceId;
    private final Price price;

    public PriceUpdated(ServiceId serviceId, Price price) {
        super("sofka.bathandcare.priceupdated");
        this.serviceId = serviceId;
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public ServiceId getServiceId() {
        return serviceId;
    }
}
