package com.sofkaU.ddd.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.sale.values.PetShopName;

public class SaleCreated extends DomainEvent {
    private final PetShopName petShopName;

    public SaleCreated(PetShopName petShopName) {
        super("sofkau.sale.salecreated");
        this.petShopName = petShopName;
    }

    public PetShopName getPetShopName() {
        return petShopName;
    }
}
