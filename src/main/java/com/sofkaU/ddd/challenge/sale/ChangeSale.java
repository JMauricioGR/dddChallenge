package com.sofkaU.ddd.challenge.sale;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.ddd.challenge.sale.events.*;
import com.sofkaU.ddd.challenge.sale.values.SellerName;

public class ChangeSale extends EventChange {
    public ChangeSale(Sale sale) {

        apply((AccesoryAdded event) ->{
            var accessory = sale.accessories.size();
            if (accessory == 0){
                throw new IllegalArgumentException("Accesory data is missing");
            }
            sale.accessories.add(new Accessories(
                    event.getAccessoryId(),
                    event.getAccessoryName(),
                    event.getPrice()
            ));
        });

        apply((AccesoryPriceUpdated event) -> {
            var accesory = sale.accessoryById(event.getAccessoryId())
                    .orElseThrow(() -> new IllegalArgumentException("Accessory doesn't found"));
            accesory.updateAccessoryPrice(event.getAccessoryId(), event.getAccesoryPrice());
        });

        apply((FoodAdded event)->{
            var food = sale.foods.size();
            if (food == 0){
                throw new IllegalArgumentException("Food data is missing");
            }
            sale.foods.add(new Food(
                    event.getFoodId(),
                    event.getFoddBrand(),
                    event.getFoddWeight(),
                    event.getFoddPrice()
            ));
        });

        apply((FoodPriceUpdated event) ->{
           var foodPrice = sale.foodById(event.getFoodId())
                   .orElseThrow(()-> new IllegalArgumentException("Food doesn't found"));
           foodPrice.updatePrice(event.getFoodId(), event.getPrice());
        });

        apply((PetShopName event)->{
            sale.petShopName = event.getPetNameUpdated();
        });

        apply((SaleCreated event)->{
            sale.petShopName = event.getPetShopName();
        });

        apply((SellerAdded event) ->{
            var seller = sale.sellers.size();
            if (seller == 0){
                throw new IllegalArgumentException("Seller data is missing");
            }
            sale.sellers.add(new Seller(
                    event.getSellerId(),
                    event.getSellerName()
            ));
        });

        apply((SellerNameUpdated event)->{
           var sellerName = sale.sellerById(event.getSellerId())
                   .orElseThrow(()-> new IllegalArgumentException("Seller doesn't found"));
            sellerName.updateSellerName(event.getSellerId(),event.getSellerName());
        });
    }
}
