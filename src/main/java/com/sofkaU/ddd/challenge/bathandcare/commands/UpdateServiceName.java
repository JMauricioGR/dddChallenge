package com.sofkaU.ddd.challenge.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceName;

public class UpdateServiceName extends Command {

    protected final ServiceId serviceId;
    protected final ServiceName serviceName;

    public UpdateServiceName(ServiceId serviceId, ServiceName serviceName){
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    public ServiceId getServiceId() {
        return serviceId;
    }

    public ServiceName getServiceName() {
        return serviceName;
    }
}
