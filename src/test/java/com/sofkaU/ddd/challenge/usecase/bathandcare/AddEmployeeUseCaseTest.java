package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddEmployee;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.EmployeeAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddEmployeeUseCaseTest {

    @Test
    void addEmployee(){
        var employeeId = new EmployeeId();
        var employeename = new EmployeeName("Andres");

        var command = new AddEmployee(employeeId, employeename);
        var usecase = new AddEmployeeUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        EmployeeAdded event = (EmployeeAdded) events.get(0);

        Assertions.assertEquals("Andres", event.getEmployeeName().value());

    }

}