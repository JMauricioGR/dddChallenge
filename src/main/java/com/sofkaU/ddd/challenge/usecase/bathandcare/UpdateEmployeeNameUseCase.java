package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.UpdateEmployeeName;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.EmployeeNameUpdated;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

public class UpdateEmployeeNameUseCase extends UseCase<RequestCommand<UpdateEmployeeName>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateEmployeeName> updateEmployeeNameRequestCommand) {
        var command = updateEmployeeNameRequestCommand.getCommand();
        var updateEmployeeName = new UpdateEmployeeName(command.getEmployeeId(), command.getEmployeeName());

        //emit().onResponse(new ResponseEvents(updateEmployeeName.));
    }
}
