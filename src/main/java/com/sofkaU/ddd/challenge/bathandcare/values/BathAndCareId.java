package com.sofkaU.ddd.challenge.bathandcare.values;

import co.com.sofka.domain.generic.Identity;

public class BathAndCareId extends Identity {
    public BathAndCareId(){

    }

    private BathAndCareId(String id){
        super(id);
    }

    public static BathAndCareId of(String id){
        return new BathAndCareId(id);
    }
}
