package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.Service;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.AddService;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.ServiceAdded;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceTime;
import com.sofkaU.ddd.challenge.domain.sale.Seller;

import java.util.List;

public class AddServiceUseCase extends UseCase<RequestCommand<AddService>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddService> addServiceRequestCommand) {
        var command = addServiceRequestCommand.getCommand();
        var addservice = new Service(command.getEntityId(), command.getServiceName(), command.getServiceTime(), command.getPrice());

        emit().onResponse(new ResponseEvents(List.of(new ServiceAdded(new ServiceId(), new ServiceName("Bathing"),new ServiceTime("1 hour"), new Price("$65.000")))));
    }
}
