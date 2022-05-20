package com.sofkaU.ddd.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.sale.values.AccessoryName;
import com.sofkaU.ddd.challenge.sale.values.Price;

public class AccesoryAdded extends DomainEvent {
    private final AccessoryId accessoryId;
    private final AccessoryName accessoryName;
    private final Price price;

    public AccesoryAdded(AccessoryId accessoryId, AccessoryName accessoryName, Price price) {
        super("sofkau.sale.accessoryadded");
        this.accessoryId = accessoryId;
        this.accessoryName = accessoryName;
        this.price = price;
    }

    public AccessoryId getAccessoryId() {
        return accessoryId;
    }

    public AccessoryName getAccessoryName() {
        return accessoryName;
    }

    public Price getPrice() {
        return price;
    }
}
