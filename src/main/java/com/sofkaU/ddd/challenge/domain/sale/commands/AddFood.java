package com.sofkaU.ddd.challenge.domain.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.sale.values.Brand;
import com.sofkaU.ddd.challenge.domain.sale.values.FoodId;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;
import com.sofkaU.ddd.challenge.domain.sale.values.Weight;

public class AddFood extends Command {

    private final FoodId foodId;
    private final Brand brand;
    private final Weight weight;
    private final Price price;

    public AddFood(FoodId foodId, Brand brand, Weight weight, Price price){
        this.foodId = foodId;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public FoodId getFoodId() {
        return foodId;
    }

    public Brand getBrand() {
        return brand;
    }

    public Weight getWeight() {
        return weight;
    }

    public Price getPrice() {
        return price;
    }
}
