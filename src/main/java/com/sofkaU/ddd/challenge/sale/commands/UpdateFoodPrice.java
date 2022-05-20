package com.sofkaU.ddd.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.sale.values.FoodId;
import com.sofkaU.ddd.challenge.sale.values.Price;

public class UpdateFoodPrice extends Command {

    private final FoodId foodId;
    private final Price price;

    public UpdateFoodPrice(FoodId foodId, Price price){
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
