package com.sofkaU.ddd.challenge.sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.sale.values.SellerId;
import com.sofkaU.ddd.challenge.sale.values.SellerName;

import java.util.Objects;

public class Seller extends Entity<SellerId> {


    private SellerName sellerName;

    public Seller(SellerId entityId, SellerName sellerName) {
        super(entityId);
        this.sellerName = sellerName;
    }

    public void updateSellerName(SellerName sellerName){
        this.sellerName = Objects.requireNonNull(sellerName);
    }

    public SellerName getSellerName() {
        return sellerName;
    }
}
