package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.UpdateServiceTime;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ServiceTimeUpdated;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UpdateServiceTmeUseCaseTest {

    @Test
    void addUpdateServiceTime (){

        var serviceId = new ServiceId();
        var time = new ServiceTime("2 hours");

        var command = new UpdateServiceTime(serviceId, time);
        var usecase = new UpdateServiceTmeUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        ServiceTimeUpdated event = (ServiceTimeUpdated) events.get(0);

        Assertions.assertEquals(1, event.getServiceId().value());
        Assertions.assertEquals("2 hours", event.getServiceTime().value());

    }


}