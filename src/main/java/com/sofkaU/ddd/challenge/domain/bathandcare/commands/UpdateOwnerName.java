package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.ClientId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.OwnerName;

public class UpdateOwnerName extends Command {

    protected final OwnerName ownerName;
    protected final ClientId clientId;

    public UpdateOwnerName(ClientId clientId, OwnerName ownerName){
        this.clientId = clientId;
        this.ownerName = ownerName;
    }

    public OwnerName getOwnerName() {
        return ownerName;
    }

    public ClientId getClientId() {
        return clientId;
    }
}
