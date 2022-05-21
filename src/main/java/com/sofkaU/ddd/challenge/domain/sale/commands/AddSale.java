package com.sofkaU.ddd.challenge.domain.sale.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.sale.values.PetShopName;
import com.sofkaU.ddd.challenge.domain.sale.values.SaleId;

public class AddSale extends Command {

    private SaleId saleId;
    private PetShopName petShopName;

    public AddSale(SaleId saleId, PetShopName petShopName){
        this.saleId = saleId;
        this.petShopName = petShopName;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public PetShopName getPetShopName() {
        return petShopName;
    }
}
