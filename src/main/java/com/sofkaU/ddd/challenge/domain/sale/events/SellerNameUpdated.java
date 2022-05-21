package com.sofkaU.ddd.challenge.domain.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerId;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerName;

public class SellerNameUpdated extends DomainEvent {
    private final SellerId sellerId;
    private final SellerName sellerName;

    public SellerNameUpdated(SellerId sellerId, SellerName sellerName) {
        super("sofkau.sales.sellernameupdated");
        this.sellerId = sellerId;
        this.sellerName = sellerName;
    }

    public SellerId getSellerId() {
        return sellerId;
    }

    public SellerName getSellerName() {
        return sellerName;
    }
}
