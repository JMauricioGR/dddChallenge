package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.BathAndCare;
import com.sofkaU.ddd.challenge.domain.bathandcare.Service;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddService;

public class AddServiceUseCase extends UseCase<RequestCommand<AddService>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddService> addServiceRequestCommand) {
        var useCaseCommand = addServiceRequestCommand.getCommand();
        var service = BathAndCare.from(useCaseCommand.getBathAndCareId(), retrieveEvents(useCaseCommand.getBathAndCareId().value()));
        service.AddService(useCaseCommand.getBathAndCareId(), useCaseCommand.getEntityId(), useCaseCommand.getServiceName(), useCaseCommand.getServiceTime(), useCaseCommand.getPrice());
        emit().onResponse(new ResponseEvents(service.getUncommittedChanges()));
    }

}
