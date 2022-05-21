package com.sofkaU.ddd.challenge.domain.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.domain.sale.values.AccessoryName;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;

public class AddAccessory extends Command {

    private final AccessoryId entityId;
    private final AccessoryName accessoryName;
    private final Price price;

    public AddAccessory(AccessoryId entityId, AccessoryName accessoryName, Price price){
        this.entityId = entityId;
        this.accessoryName = accessoryName;
        this.price = price;
    }

    public AccessoryId getEntityId() {
        return entityId;
    }

    public AccessoryName getAccessoryName() {
        return accessoryName;
    }

    public Price getPrice() {
        return price;
    }
}
