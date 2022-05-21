package com.sofkaU.ddd.challenge.usecase.sale;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.sale.commands.AddSeller;
import com.sofkaU.ddd.challenge.domain.sale.events.SellerAdded;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerId;
import com.sofkaU.ddd.challenge.domain.sale.values.SellerName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddSellerUseCaseTest {

    @Test
    void addSeller(){
        var sellerId = new SellerId();
        var sellerName = new SellerName("July");

        var command = new AddSeller(sellerId, sellerName);
        var usecase = new AddSellerUseCase();

        List<DomainEvent> events = UseCaseHandler
                .getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        SellerAdded event = (SellerAdded) events.get(0);

        Assertions.assertEquals("July", event.getSellerName().value());

    }

}