package com.sofkaU.ddd.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;

public class PetShopName extends DomainEvent {

    private com.sofkaU.ddd.challenge.sale.values.PetShopName petShopName;


    public PetShopName(com.sofkaU.ddd.challenge.sale.values.PetShopName petShopName) {
        super("sofkau.sale.petnameupdated");
        this.petShopName = petShopName;
    }

    public com.sofkaU.ddd.challenge.sale.values.PetShopName getPetNameUpdated() {
        return com.sofkaU.ddd.challenge.sale.values.PetShopName;
    }
}
