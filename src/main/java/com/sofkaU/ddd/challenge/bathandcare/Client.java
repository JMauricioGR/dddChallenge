package com.sofkaU.ddd.challenge.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.bathandcare.values.OwnerName;
import com.sofkaU.ddd.challenge.bathandcare.values.PetName;
import com.sofkaU.ddd.challenge.bathandcare.values.ServiceId;

import java.util.Objects;

public class Client extends Entity<ClientId> {

    private OwnerName ownerName;
    private PetName petName;

    public Client(ClientId clientId, OwnerName ownerName, PetName petName){
        super(clientId);
        this.ownerName = ownerName;
        this.petName = petName;
    }

    public OwnerName getOwnerName() {
        return ownerName;
    }

    public void UpdatePetName(ClientId clientId, PetName petName){
        this.petName = Objects.requireNonNull(petName);
        this.entityId = Objects.requireNonNull(clientId);
    }

    public void UpdateOwnerName(ClientId clientId, OwnerName ownerName){
        this.ownerName = Objects.requireNonNull(ownerName);
        this.entityId = Objects.requireNonNull(clientId);
    }

    public PetName getPetName() {
        return petName;
    }
}
