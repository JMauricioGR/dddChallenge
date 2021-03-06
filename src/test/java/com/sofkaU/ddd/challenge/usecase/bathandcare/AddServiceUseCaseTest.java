package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddService;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.BathAndCareCreated;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ServiceAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddServiceUseCaseTest {

    @Mock
    private DomainEventRepository repository;
    @InjectMocks
    private AddServiceUseCase useCase;
    @Test
    void addService(){
        var bathandcareid = BathAndCareId.of("12");
        var serviceId = ServiceId.of("2");
        var serviceName = new ServiceName("Bathing");
        var serviceTime = new ServiceTime("1 hour");
        var price = new Price("$65.000");

        var command = new AddService(bathandcareid,serviceId,serviceName,serviceTime,price);

        var aggregateCreated = new BathAndCareCreated(new PetShopName("Best Pet Shop"));
        aggregateCreated.setAggregateRootId("12");
        when(repository.getEventsBy("12")).thenReturn(List.of(aggregateCreated));

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("12")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        ServiceAdded event = (ServiceAdded) events.get(0);

        Assertions.assertEquals(command.getServiceName().value(), event.getServiceName().value());
        Assertions.assertEquals(command.getServiceTime().value(), event.getServiceTime().value());
        Assertions.assertEquals(command.getPrice().value(), event.getPrice().value());
    }

}