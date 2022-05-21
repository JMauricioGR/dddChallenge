package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.Service;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddService;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ServiceAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddServiceUseCaseTest {

    @Test
    void addService(){

        var serviceId = new ServiceId();
        var serviceName = new ServiceName("Bathing");
        var serviceTime = new ServiceTime("1 hour");
        var price = new Price("$65.000");

        var command = new AddService(serviceId,serviceName,serviceTime,price);
        var usecase = new AddServiceUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        ServiceAdded event = (ServiceAdded) events.get(0);

        Assertions.assertEquals("Bathing", event.getServiceName().value());
        Assertions.assertEquals("1 hour", event.getServiceTime().value());
        Assertions.assertEquals("$65.000", event.getPrice().value());
    }

}