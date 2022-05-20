package com.sofkaU.ddd.challenge.sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.sale.values.Brand;
import com.sofkaU.ddd.challenge.sale.values.FoodId;
import com.sofkaU.ddd.challenge.sale.values.Price;
import com.sofkaU.ddd.challenge.sale.values.Weight;

import java.util.Objects;

public class Food extends Entity<FoodId> {
    private Brand brand;
    private Weight weight;
    private Price price;

    public Food(FoodId foodId, Brand brand, Weight weight, Price price){
        super(foodId);

        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public void updatePrice(FoodId foodId, Price price){
        this.price = Objects.requireNonNull(price);
    }

    public Brand getFoodBrand() {
        return brand;
    }

    public Weight getFoodWeight() {
        return weight;
    }

    public Price getFoodPrice() {
        return price;
    }
}
