package com.sofkaU.ddd.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.sale.values.Price;

public class AccesoryPriceUpdated extends DomainEvent {
    private final AccessoryId accessoryId;
    private final Price price;

    public AccesoryPriceUpdated(AccessoryId accessoryId, Price price) {
        super("sofkau.sales.accessorypriceupdated");
        this.accessoryId = accessoryId;
        this.price = price;
    }

    public AccessoryId getAccessoryId() {
        return accessoryId;
    }

    public Price getPrice() {
        return price;
    }
}
