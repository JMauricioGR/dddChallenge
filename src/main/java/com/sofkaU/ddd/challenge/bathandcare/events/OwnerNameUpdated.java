package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.OwnerName;

public class OwnerNameUpdated extends DomainEvent {
    private final OwnerName ownerName;

    public OwnerNameUpdated(OwnerName ownerName) {
        super("sofka.bathandcare.ownernameupdated");
        this.ownerName = ownerName;
    }

    public OwnerName getOwnerName() {
        return ownerName;
    }
}
