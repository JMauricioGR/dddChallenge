package com.sofkaU.ddd.challenge.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.bathandcare.values.Price;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;

public class UpdatePrice extends Command {

    protected final ServiceId serviceId;
    protected final Price price;

    public UpdatePrice(ServiceId serviceId, Price price){
        this.serviceId = serviceId;
        this.
                price = price;
    }

    public ServiceId getServiceId() {
        return serviceId;
    }

    public Price getPrice() {
        return price;
    }
}
