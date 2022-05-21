package com.sofkaU.ddd.challenge.domain.sale;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerId;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerName;

import java.util.Objects;

public class Seller extends Entity<SellerId> {


    private SellerName sellerName;

    public Seller(SellerId entityId, SellerName sellerName) {
        super(entityId);
        this.sellerName = sellerName;
    }

    public void updateSellerName(SellerId sellerId, SellerName sellerName){
        this.sellerName = Objects.requireNonNull(sellerName);
    }

    public SellerName getSellerName() {
        return sellerName;
    }
}
