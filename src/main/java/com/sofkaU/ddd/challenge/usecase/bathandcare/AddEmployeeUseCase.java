package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.Employee;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddEmployee;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.EmployeeAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddEmployeeUseCase extends UseCase<RequestCommand<AddEmployee>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddEmployee> addEmployeeRequestCommand) {

        var command = addEmployeeRequestCommand.getCommand();
        var employee = new Employee(command.getEntityId(), command.getEmployeeName());

        emit().onResponse(new ResponseEvents(List.of(new EmployeeAdded(new EmployeeId(), new EmployeeName("Andres")))));

//        emit().onResponse(new ResponseEvents(employee.getUncommittedchange()));
    }
}
