package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.Client;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddClient;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ClientAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.OwnerName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.PetName;
import com.sofkaU.ddd.challenge.domain.sale.Seller;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AddClientUseCase extends UseCase<RequestCommand<AddClient>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddClient> addClientRequestCommand) {

        var command = addClientRequestCommand.getCommand();
        var addseller = new Client(command.getClientId(), command.getOwnerName(), command.getPetName());

        emit().onResponse(new ResponseEvents(List.of(new ClientAdded(new ClientId(), new OwnerName("Samuel"), new PetName("Simona")))));


    }
}
