package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.Service;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.UpdateServiceTime;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ServiceTimeUpdated;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceTime;

import java.util.List;

public class UpdateServiceTmeUseCase extends UseCase<RequestCommand<UpdateServiceTime>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<UpdateServiceTime> updateServiceTimeRequestCommand) {

        var command = updateServiceTimeRequestCommand.getCommand();
        var updateTime = new Service(command.getServiceId(), command.getServiceTime());

        emit().onResponse(new ResponseEvents(List.of(new ServiceTimeUpdated(new ServiceId(),new ServiceTime("2 hours")))));

    }
}
