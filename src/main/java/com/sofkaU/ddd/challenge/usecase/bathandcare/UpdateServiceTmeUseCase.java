package com.sofkaU.ddd.challenge.usecase.bathandcare;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.ddd.challenge.domain.bathandcare.commands.UpdateServiceTime;

public class UpdateServiceTmeUseCase extends UseCase<RequestCommand<UpdateServiceTime>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<UpdateServiceTime> updateServiceTimeRequestCommand) {

    }
}
