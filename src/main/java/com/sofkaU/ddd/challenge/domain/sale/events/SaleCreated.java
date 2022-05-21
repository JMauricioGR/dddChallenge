package com.sofkaU.ddd.challenge.domain.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.sale.values.PetShopName;

public class SaleCreated extends DomainEvent {
    private final com.sofkaU.ddd.challenge.domain.sale.values.PetShopName petShopName;

    public SaleCreated(com.sofkaU.ddd.challenge.domain.sale.values.PetShopName petShopName) {
        super("sofkau.sale.salecreated");
        this.petShopName = petShopName;
    }

    public PetShopName getPetShopName() {
        return petShopName;
    }
}
