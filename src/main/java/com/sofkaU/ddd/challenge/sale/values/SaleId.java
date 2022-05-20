package com.sofkaU.ddd.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;

public class SaleId extends Identity {
    public SaleId(){

    }

    private SaleId(String id){
        super(id);
    }

    public static SaleId of(String id){
        return new SaleId(id);
    }
}
