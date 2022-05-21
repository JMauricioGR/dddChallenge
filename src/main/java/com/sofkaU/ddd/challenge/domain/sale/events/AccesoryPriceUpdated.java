package com.sofkaU.ddd.challenge.domain.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;

public class AccesoryPriceUpdated extends DomainEvent {
    private AccessoryId accessoryId;
    private Price price;

    public AccesoryPriceUpdated(AccessoryId accessoryId, Price price) {
        super("sofkau.sales.accessorypriceupdated");
        this.accessoryId = accessoryId;
        this.price = price;
    }

    public AccessoryId getAccessoryId() {
        return accessoryId;
    }

    public Price getAccesoryPrice() {
        return price;
    }
}
