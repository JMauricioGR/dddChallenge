package com.sofkaU.ddd.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.sale.values.SellerId;
import com.sofkaU.ddd.challenge.sale.values.SellerName;

public class AddSeller extends Command {

    private final SellerId entityId;
    private final SellerName sellerName;

    public AddSeller(SellerId entityId, SellerName sellerName){
        this.entityId = entityId;
        this.sellerName = sellerName;
    }

    public SellerId getEntityId() {
        return entityId;
    }

    public SellerName getSellerName() {
        return sellerName;
    }
}
