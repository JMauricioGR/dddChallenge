package com.sofkaU.ddd.challenge.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.sale.values.SellerId;
import com.sofkaU.ddd.challenge.sale.values.SellerName;

public class SellerAdded extends DomainEvent {
    private final SellerId sellerId;
    private final SellerName sellerName;

    public SellerAdded(SellerId sellerId, SellerName sellerName) {
        super("sofka.sale.selleradded");
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
