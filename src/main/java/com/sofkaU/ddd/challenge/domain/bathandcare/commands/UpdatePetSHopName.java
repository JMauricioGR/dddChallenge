package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.PetShopName;

public class UpdatePetSHopName extends Command {

    protected final BathAndCareId bathAndCareId;
    protected final PetShopName petShopName;

    public UpdatePetSHopName(BathAndCareId bathAndCareId, PetShopName petShopName){
        this.bathAndCareId = bathAndCareId;
        this.petShopName = petShopName;
    }

    public BathAndCareId getBathAndCareId() {
        return bathAndCareId;
    }

    public PetShopName getPetShopName() {
        return petShopName;
    }
}
