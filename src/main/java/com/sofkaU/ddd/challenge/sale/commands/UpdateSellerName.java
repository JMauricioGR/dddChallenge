package com.sofkaU.ddd.challenge.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.sale.values.SellerId;
import com.sofkaU.ddd.challenge.sale.values.SellerName;

public class UpdateSellerName extends Command {

    private final SellerId sellerId;
    private final SellerName sellerName;

    public UpdateSellerName(SellerId sellerId, SellerName sellerName){
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
