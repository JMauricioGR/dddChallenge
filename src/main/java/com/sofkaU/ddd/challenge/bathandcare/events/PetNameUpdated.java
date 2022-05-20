package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.PetName;

public class PetNameUpdated extends DomainEvent {
    private final PetName petName;

    public PetNameUpdated(PetName petName) {
        super("sofka.bathandcare.petnameupdated");
        this.petName = petName;
    }

    public PetName getPetName() {
        return petName;
    }
}
