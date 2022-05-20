package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.bathandcare.values.PetShopName;

public class PetShopNameUpdated extends DomainEvent {
    private final BathAndCareId bathAndCareId;
    private final PetShopName petShopName;

    public PetShopNameUpdated(BathAndCareId bathAndCareId, PetShopName petShopName) {
        super("sofka.bathandcare.petshopnameupdated");
        this.bathAndCareId = bathAndCareId;
        this.petShopName = petShopName;
    }

    public PetShopName getPetShopName() {
        return petShopName;
    }

    public BathAndCareId getBathAndCareId() {
        return bathAndCareId;
    }
}
