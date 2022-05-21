package com.sofkaU.ddd.challenge.usecase.sale;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.sale.Food;
import com.sofkaU.ddd.challenge.domain.sale.Seller;
import com.sofkaU.ddd.challenge.domain.sale.commands.AddFood;
import com.sofkaU.ddd.challenge.domain.sale.events.FoodAdded;
import com.sofkaU.ddd.challenge.domain.sale.values.Brand;
import com.sofkaU.ddd.challenge.domain.sale.values.FoodId;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;
import com.sofkaU.ddd.challenge.domain.sale.values.Weight;

import java.util.List;

public class AddFoodUseCase extends UseCase<RequestCommand<AddFood>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddFood> addFoodRequestCommand) {
        var command = addFoodRequestCommand.getCommand();
        var addseller = new Food(command.getFoodId(), command.getBrand(), command.getWeight(), command.getPrice());

        emit().onResponse((new ResponseEvents(List.of(new FoodAdded(new FoodId(),new Brand("Cat chow"), new Weight("1.5 Kg"), new Price("$15.000"))))));


    }
}
