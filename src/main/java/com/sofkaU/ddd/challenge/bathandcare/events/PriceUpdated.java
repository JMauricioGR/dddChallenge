package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.Price;

public class PriceUpdated extends DomainEvent {
    private final Price price;

    public PriceUpdated(Price price) {
        super("sofka.bathandcare.priceupdated");
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}
