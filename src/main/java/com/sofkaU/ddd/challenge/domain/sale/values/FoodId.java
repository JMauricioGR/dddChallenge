package com.sofkaU.ddd.challenge.domain.sale.values;

import co.com.sofka.domain.generic.Identity;

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
