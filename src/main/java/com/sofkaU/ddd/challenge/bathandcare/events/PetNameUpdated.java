package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.bathandcare.values.PetName;

public class PetNameUpdated extends DomainEvent {
    private final ClientId clientId;
    private final PetName petName;

    public PetNameUpdated(ClientId clientId,PetName petName) {
        super("sofka.bathandcare.petnameupdated");
        this.clientId = clientId;
        this.petName = petName;
    }

    public PetName getPetName() {
        return petName;
    }

    public ClientId getClientId() {
        return clientId;
    }
}
