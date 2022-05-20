package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.PetShopName;

public class PetShopNameUpdated extends DomainEvent {
    private final PetShopName petShopName;

    public PetShopNameUpdated(PetShopName petShopName) {
        super("sofka.bathandcare.petshopnameupdated");
        this.petShopName = petShopName;
    }

    public PetShopName getPetShopName() {
        return petShopName;
    }
}
