package com.sofkaU.ddd.challenge.sale.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.ddd.challenge.bathandcare.values.ClientId;

public class FoodId extends Identity {
    public FoodId(){

    }

    private FoodId(String id){
        super(id);
    }

    public static FoodId of(String id){
        return new FoodId(id);
    }
}
