package com.sofkaU.ddd.challenge.domain.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.sale.values.Brand;
import com.sofkaU.ddd.challenge.domain.sale.values.FoodId;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;
import com.sofkaU.ddd.challenge.domain.sale.values.Weight;

public class FoodAdded extends DomainEvent {
    private final FoodId foodId;
    private final Brand brand;
    private final Weight weight;
    private final Price price;

    public FoodAdded(FoodId foodId, Brand brand, Weight weight, Price price) {
        super("sofkau.sale.foodadded");
        this.foodId = foodId;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public FoodId getFoodId() {
        return foodId;
    }

    public Brand getFoddBrand() {
        return brand;
    }

    public Weight getFoddWeight() {
        return weight;
    }

    public Price getFoddPrice() {
        return price;
    }
}
