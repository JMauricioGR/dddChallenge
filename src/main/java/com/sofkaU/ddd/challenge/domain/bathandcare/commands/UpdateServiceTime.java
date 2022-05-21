package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ServiceTime;

public class UpdateServiceTime extends Command {

    protected final ServiceId serviceId;
    protected final ServiceTime serviceTime;

    public UpdateServiceTime(ServiceId serviceId, ServiceTime serviceTime){
        this.serviceId = serviceId;
        this.serviceTime = serviceTime;
    }

    public ServiceId getServiceId() {
        return serviceId;
    }

    public ServiceTime getServiceTime() {
        return serviceTime;
    }
}
