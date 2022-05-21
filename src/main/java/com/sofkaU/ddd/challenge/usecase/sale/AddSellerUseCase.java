package com.sofkaU.ddd.challenge.usecase.sale;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.sale.Seller;
import com.sofkaU.ddd.challenge.domain.sale.commands.AddSeller;
import com.sofkaU.ddd.challenge.domain.sale.events.SellerAdded;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerId;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerName;

import java.util.List;


public class AddSellerUseCase extends UseCase<RequestCommand<AddSeller>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddSeller> addSellerRequestCommand) {

        var command = addSellerRequestCommand.getCommand();
        var addseller = new Seller(command.getEntityId(), command.getSellerName());

        emit().onResponse(new ResponseEvents(List.of(new SellerAdded(new SellerId(), new SellerName("July")))));

//        var command = addSellerRequestCommand.getCommand();
//        var seller = new Seller(command.getEntityId(), command.getSellerName());
//
//        emit().onResponse(new ResponseEvents(seller.));
    }
}
