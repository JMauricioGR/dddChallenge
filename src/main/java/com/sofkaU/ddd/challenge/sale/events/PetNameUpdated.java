package com.sofkaU.ddd.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.sale.values.PetShopName;

public class PetNameUpdated extends DomainEvent {

    private final PetNameUpdated petNameUpdated;

    public PetNameUpdated(PetShopName petNameUpdated) {
        super("sofkau.sale.petnameupdated");
        this.petNameUpdated = petNameUpdated;
    }

    public PetNameUpdated getPetNameUpdated() {
        return petNameUpdated;
    }
}
