package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddEmployee;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.BathAndCareCreated;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.EmployeeAdded;
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
class AddEmployeeUseCaseTest {

    @Mock
    private DomainEventRepository repository;
    @InjectMocks
    private AddEmployeeUseCase useCase;
    @Test
    void addEmployee(){
        var bathAndCareId = BathAndCareId.of("1");
        var employeeId = new EmployeeId();
        var employeename = new EmployeeName("Andres");

        var command = new AddEmployee(bathAndCareId, employeeId, employeename);

        var aggregateCreated = new BathAndCareCreated(new PetShopName("Best Pet Shop "));
        aggregateCreated.setAggregateRootId("1");

        when(repository.getEventsBy("1")).thenReturn(List.of(aggregateCreated));

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        EmployeeAdded event = (EmployeeAdded) events.get(0);

        Assertions.assertEquals("Andres", event.getEmployeeName().value());

    }

}