package com.sofkaU.ddd.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;

public class AccessoryId extends Identity {
    public AccessoryId(){

    }

    private AccessoryId(String id){
        super(id);
    }

    public static AccessoryId of(String id){
        return new AccessoryId(id);
    }
}
