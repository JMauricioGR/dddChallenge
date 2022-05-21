package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddClient;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ClientAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.OwnerName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.PetName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddClientUseCaseTest {

    @Test
    void addClient(){
        var clientId = new ClientId();
        var ownerName = new OwnerName("Samuel");
        var petName = new PetName("Simona");

        var command = new AddClient(clientId,ownerName,petName);
        var usecase = new AddClientUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        ClientAdded event = (ClientAdded) events.get(0);

        Assertions.assertEquals("Samuel", event.getOwnerName().value());
        Assertions.assertEquals("Simona", event.getPetName().value());
    }

}