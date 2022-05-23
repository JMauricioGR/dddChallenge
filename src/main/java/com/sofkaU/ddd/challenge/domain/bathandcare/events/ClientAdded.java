package com.sofkaU.ddd.challenge.domain.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.OwnerName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.PetName;

public class ClientAdded extends DomainEvent {
    private final BathAndCareId bathAndCareId;
    private final ClientId clientId;
    private final OwnerName ownerName;
    private final PetName petName;

    public ClientAdded(BathAndCareId bathAndCareId,ClientId clientId, OwnerName ownerName, PetName petName) {
        super("sofkau.bathandcare.clientadded");
        this.bathAndCareId = bathAndCareId;
        this.clientId = clientId;
        this.ownerName = ownerName;
        this.petName = petName;
    }

    public BathAndCareId getBathAndCareId() {
        return bathAndCareId;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public OwnerName getOwnerName() {
        return ownerName;
    }

    public PetName getPetName() {
        return petName;
    }
}
