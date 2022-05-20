package com.sofkaU.ddd.challenge.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.bathandcare.values.OwnerName;
import com.sofkaU.ddd.challenge.bathandcare.values.PetName;

public class UpdatePetName extends Command {

    protected final ClientId clientId;
    protected final PetName petName;

    public UpdatePetName(ClientId clientId, PetName petName){
        this.clientId = clientId;
        this.petName = petName;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public PetName getPetName() {
        return petName;
    }
}
