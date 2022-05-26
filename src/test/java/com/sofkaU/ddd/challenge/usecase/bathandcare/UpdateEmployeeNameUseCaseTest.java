package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddEmployee;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.UpdateEmployeeName;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.BathAndCareCreated;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.EmployeeAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.EmployeeNameUpdated;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.PetShopName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UpdateEmployeeNameUseCaseTest {

    @Mock
    private DomainEventRepository repository;
    @InjectMocks
    private UpdateEmployeeNameUseCase useCase;
    @Test
    void updateEmployeeName(){
        var bathAndCareId = BathAndCareId.of("1");
        var employeeId = EmployeeId.of("21");
        var employeename = new EmployeeName("Sergio");

        var command = new UpdateEmployeeName(bathAndCareId,employeeId,employeename);

        var aggregateCreated = new BathAndCareCreated(new PetShopName("Best Pet Shop "));
        aggregateCreated.setAggregateRootId("1");
        var entityCreated = new EmployeeAdded(BathAndCareId.of("1"), EmployeeId.of("21"), new EmployeeName("Andres"));

        when(repository.getEventsBy("1")).thenReturn(List.of(aggregateCreated, entityCreated));

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        EmployeeNameUpdated event = (EmployeeNameUpdated) events.get(0);

        Assertions.assertEquals(command.getEmployeeName().value(), event.getEmployeeName().value());
    }

}