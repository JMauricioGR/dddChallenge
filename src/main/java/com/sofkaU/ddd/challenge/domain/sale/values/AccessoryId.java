package com.sofkaU.ddd.challenge.domain.sale.values;

import co.com.sofka.domain.generic.Identity;

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
