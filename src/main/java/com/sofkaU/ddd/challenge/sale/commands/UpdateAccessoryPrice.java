package com.sofkaU.ddd.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.sale.values.Price;

public class UpdateAccessoryPrice extends Command {

    private final AccessoryId accessoryId;
    private final Price price;

    public UpdateAccessoryPrice(AccessoryId accessoryId, Price price){
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
