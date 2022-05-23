package com.sofkaU.ddd.challenge.domain.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.OwnerName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.PetName;

import java.util.Objects;

public class Client extends Entity<ClientId> {

    private final BathAndCareId bathAndCareId;
    private OwnerName ownerName;
    private PetName petName;

    public Client(BathAndCareId bathAndCareId, ClientId clientId, OwnerName ownerName, PetName petName){
        super(clientId);
        this.bathAndCareId = bathAndCareId;
        this.ownerName = ownerName;
        this.petName = petName;
    }


    public void UpdatePetName(PetName petName){
        this.petName = Objects.requireNonNull(petName);
    }

    public void UpdateOwnerName(OwnerName ownerName){
        this.ownerName = Objects.requireNonNull(ownerName);
    }

    public OwnerName ownerName() {
        return ownerName;
    }

    public PetName petName() {
        return petName;
    }
}
