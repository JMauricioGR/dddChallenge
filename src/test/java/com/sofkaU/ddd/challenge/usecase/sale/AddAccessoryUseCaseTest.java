package com.sofkaU.ddd.challenge.usecase.sale;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.sale.commands.AddAccessory;
import com.sofkaU.ddd.challenge.domain.sale.events.AccesoryAdded;
import com.sofkaU.ddd.challenge.domain.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.domain.sale.values.AccessoryName;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class AddAccessoryUseCaseTest {

    @Test
    void addCategory (){
        var accessoryId = new AccessoryId();
        var accessoryName = new AccessoryName("Costume");
        var price = new Price("$80.000");

        var command = new AddAccessory(accessoryId, accessoryName, price);
        var usecase = new AddAccessoryUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        AccesoryAdded event = (AccesoryAdded) events.get(0);

        Assertions.assertEquals(command.getAccessoryName().value(), event.getAccessoryName().value());
        Assertions.assertEquals(command.getPrice().value(), event.getPrice().value());
    }

}