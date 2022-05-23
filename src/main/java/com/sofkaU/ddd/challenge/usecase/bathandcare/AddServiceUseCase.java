package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.BathAndCare;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddService;

public class AddServiceUseCase extends UseCase<RequestCommand<AddService>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddService> addServiceRequestCommand) {
        var command = addServiceRequestCommand.getCommand();
        var addservice = BathAndCare.from(command.getBathAndCareId(), retrieveEvents(command.getBathAndCareId().value()));
        addservice.AddService(command.getBathAndCareId(), command.getEntityId(),command.getServiceName(),command.getServiceTime(),command.getPrice());

        emit().onResponse(new ResponseEvents(addservice.getUncommittedChanges()));
    }
}
