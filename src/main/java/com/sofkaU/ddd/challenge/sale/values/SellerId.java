package com.sofkaU.ddd.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;

public class SellerId extends Identity {
    public SellerId(){

    }

    private SellerId(String id){
        super(id);
    }

    public static SellerId of(String id){
        return new SellerId(id);
    }
}
