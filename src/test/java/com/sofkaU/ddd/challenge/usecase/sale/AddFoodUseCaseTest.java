package com.sofkaU.ddd.challenge.usecase.sale;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.sale.commands.AddFood;
import com.sofkaU.ddd.challenge.domain.sale.events.FoodAdded;
import com.sofkaU.ddd.challenge.domain.sale.values.Brand;
import com.sofkaU.ddd.challenge.domain.sale.values.FoodId;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;
import com.sofkaU.ddd.challenge.domain.sale.values.Weight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddFoodUseCaseTest {

    @Test
    void addFood(){
        var foodId = new FoodId();
        var brand = new Brand("Cat chow");
        var weith = new Weight("1.5 Kg");
        var price = new Price("$15.000");

        var command = new AddFood(foodId, brand, weith, price);
        var usecase = new AddFoodUseCase();


        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        FoodAdded event = (FoodAdded) events.get(0);

        Assertions.assertEquals("Cat chow", event.getFoddBrand().value());
        Assertions.assertEquals("1.5 Kg", event.getFoddWeight().value());
        Assertions.assertEquals("$15.000", event.getFoddPrice().value());
    }

}