package com.sofkaU.ddd.challenge.sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.sale.values.AccessoryName;
import com.sofkaU.ddd.challenge.sale.values.Price;

import java.util.Objects;

public class Accessories extends Entity<AccessoryId> {


    private AccessoryName accessoryName;
    private Price price;

    public Accessories(AccessoryId entityId, AccessoryName accessoryName, Price price) {
        super(entityId);
        this.accessoryName = accessoryName;
        this.price = price;
        this.accessoryName = accessoryName;
        this.price = price;
    }

    public void updateAccessoryPrice(Price price){
        this.price = Objects.requireNonNull(price);
    }

    public AccessoryName getAccessoryName() {
        return accessoryName;
    }

    public Price getAccessoryPrice() {
        return price;
    }
}
