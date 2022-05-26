package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.BathAndCare;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddClient;

public class AddClientUseCase extends UseCase<RequestCommand<AddClient>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddClient> addClientRequestCommand) {

        var command = addClientRequestCommand.getCommand();
        var addClient = BathAndCare.from(command.getBathAndCareId(), retrieveEvents(command.getBathAndCareId().value()));
        addClient.AddClient(command.getBathAndCareId(), command.getClientId(), command.getOwnerName(),command.getPetName());
        emit().onResponse(new ResponseEvents(addClient.getUncommittedChanges()));
    }
}
