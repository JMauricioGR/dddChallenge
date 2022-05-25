package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.BathAndCare;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddEmployee;

public class AddEmployeeUseCase extends UseCase<RequestCommand<AddEmployee>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddEmployee> addEmployeeRequestCommand) {

        var command = addEmployeeRequestCommand.getCommand();
        var employee = BathAndCare.from(command.getBathAndCareId(), retrieveEvents(command.getBathAndCareId().value()));
        employee.AddEmployee(command.getBathAndCareId(), command.getEntityId(),command.getEmployeeName());

        emit().onResponse(new ResponseEvents(employee.getUncommittedChanges()));
    }
}
