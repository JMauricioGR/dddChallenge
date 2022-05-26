package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddClient;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.BathAndCareCreated;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ClientAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AddClientUseCaseTest {

    @Mock
    private DomainEventRepository repository;
    @InjectMocks
    private AddClientUseCase useCase;
    @Test
    void addClient(){
        var bathandcareid = BathAndCareId.of("12");
        var clientId = ClientId.of("2");
        var ownerName = new OwnerName("Samuel");
        var petName = new PetName("Simona");

        var command = new AddClient(bathandcareid, clientId,ownerName,petName);

        var aggregateCreated = new BathAndCareCreated(new PetShopName("Best Pet Shop"));
        aggregateCreated.setAggregateRootId("12");

        when(repository.getEventsBy("12")).thenReturn(List.of(aggregateCreated));

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("12")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        ClientAdded event = (ClientAdded) events.get(0);

        Assertions.assertEquals(command.getOwnerName().value(), event.getOwnerName().value());
        Assertions.assertEquals(command.getPetName().value(), event.getPetName().value());
    }

}