package com.sofkaU.ddd.challenge.usecase.sale;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.sale.Accessories;
import com.sofkaU.ddd.challenge.domain.sale.commands.AddAccessory;
import com.sofkaU.ddd.challenge.domain.sale.events.AccesoryAdded;
import com.sofkaU.ddd.challenge.domain.sale.values.AccessoryId;
import com.sofkaU.ddd.challenge.domain.sale.values.AccessoryName;
import com.sofkaU.ddd.challenge.domain.sale.values.Price;

import java.util.List;

public class AddAccessoryUseCase extends UseCase<RequestCommand<AddAccessory>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddAccessory> addAccessoryRequestCommand) {
        var command = addAccessoryRequestCommand.getCommand();
        var accessory = new Accessories(command.getEntityId(), command.getAccessoryName(), command.getPrice());

        emit().onResponse(new ResponseEvents(List.of(new AccesoryAdded(new AccessoryId(), new AccessoryName("Costume"), new Price("$80.000")))));
    }
}
