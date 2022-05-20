package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.bathandcare.values.PetShopName;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;

public class BathAndCareCreated extends DomainEvent {
    private final PetShopName petShopName;
    private ClientId clientId;
    private ServiceId serviceId;
    private EmployeeId employeeId;

    public BathAndCareCreated(PetShopName petShopName) {
        super("sofkau.bathandcare.bathancarecreated");
        this.petShopName = petShopName;

    }

    public PetShopName getPetShopName() {
        return petShopName;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public ServiceId getServiceId() {
        return serviceId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }
}
