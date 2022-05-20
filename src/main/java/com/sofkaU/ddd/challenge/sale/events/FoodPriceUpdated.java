package com.sofkaU.ddd.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.sale.values.FoodId;
import com.sofkaU.ddd.challenge.sale.values.Price;

public class FoodPriceUpdated extends DomainEvent {
    private final FoodId foodId;
    private final Price price;

    public FoodPriceUpdated(FoodId foodId, Price price) {
        super("sofkau.sales.foodproceupdated");
        this.foodId = foodId;
        this.price = price;
    }

    public FoodId getFoodId() {
        return foodId;
    }

    public Price getPrice() {
        return price;
    }
}
