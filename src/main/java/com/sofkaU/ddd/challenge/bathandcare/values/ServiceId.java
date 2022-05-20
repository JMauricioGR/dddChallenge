package com.sofkaU.ddd.challenge.bathandcare.values;

import co.com.sofka.domain.generic.Identity;

public class ServiceId extends Identity {
    public ServiceId(){

    }

    private ServiceId(String id){
        super(id);
    }

    public static ServiceId of(String id){
        return new ServiceId(id);
    }
}
