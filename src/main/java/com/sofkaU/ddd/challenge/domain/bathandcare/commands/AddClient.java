package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.OwnerName;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.PetName;

public class AddClient extends Command {

    protected final ClientId clientId;
    protected final OwnerName ownerName;
    protected final PetName petName;

    public AddClient(ClientId clientId, OwnerName ownerName, PetName petName){
        this.clientId = clientId;
        this.ownerName = ownerName;
        this.petName = petName;
    }

    public ClientId getClientId() {
        return clientId;
    }

    public OwnerName getOwnerName() {
        return ownerName;
    }

    public PetName getPetName() {
        return petName;
    }
}
