package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.bathandcare.values.OwnerName;

public class OwnerNameUpdated extends DomainEvent {
    private final ClientId clientId;
    private final OwnerName ownerName;

    public OwnerNameUpdated(ClientId clientId, OwnerName ownerName) {
        super("sofka.bathandcare.ownernameupdated");
        this.clientId = clientId;
        this.ownerName = ownerName;
    }

    public OwnerName getOwnerName() {
        return ownerName;
    }

    public ClientId getClientId() {
        return clientId;
    }
}
