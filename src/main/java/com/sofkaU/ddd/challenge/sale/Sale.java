package com.sofkaU.ddd.challenge.sale;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;


import com.sofkaU.ddd.challenge.sale.events.*;
import com.sofkaU.ddd.challenge.sale.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Sale extends AggregateEvent<SaleId> {
    protected PetShopName petShopName;
    protected Set<Food> foods;
    protected Set<Accessories> accessories;
    protected Set<Seller> sellers;


    public Sale(SaleId saleId, PetShopName petShopName) {
        super(saleId);
        appendChange(new SaleCreated(petShopName)).apply();
    }

    private Sale(SaleId saleId){
        super(saleId);
        subscribe(new ChangeSale(this));
    }

    public static Sale from(SaleId saleId, List<DomainEvent> events){
        var sale = new Sale(saleId);
        events.forEach(sale::applyEvent);
        return sale;
    }

    public void updatePetShopName(PetShopName petShopName){
        appendChange(new PetNameUpdated(petShopName)).apply();
    }

    public void addFood(FoodId foodId, Brand brand, Weight weight, Price price){
        Objects.requireNonNull(foodId);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(weight);
        Objects.requireNonNull(price);
        appendChange(new FoodAdded(foodId, brand, weight, price)).apply();
    }

    public void addAccessory(AccessoryId accessoryId, AccessoryName accessoryName, Price price){
        Objects.requireNonNull(accessoryId);
        Objects.requireNonNull(accessoryName);
        Objects.requireNonNull(price);
        appendChange(new AccesoryAdded(accessoryId, accessoryName, price)).apply();
    }

    public void addSeller(SellerId sellerId, SellerName sellerName){
        Objects.requireNonNull(sellerId);
        Objects.requireNonNull(sellerName);
        appendChange(new SellerAdded(sellerId, sellerName)).apply();
    }

    public void updateFoodPrice(FoodId foodId, Price price){
        Objects.requireNonNull(foodId);
        Objects.requireNonNull(price);
        appendChange(new FoodPriceUpdated(foodId, price)).apply();
    }

    public void updateAccessoryPrice(AccessoryId accessoryId, Price price){
        Objects.requireNonNull(accessoryId);
        Objects.requireNonNull(price);
        appendChange(new AccesoryPriceUpdated(accessoryId, price)).apply();
    }

    public void updateSellerName(SellerId sellerId, SellerName sellerName){
        Objects.requireNonNull(sellerId);
        Objects.requireNonNull(sellerName);
        appendChange(new SellerNameUpdated(sellerId, sellerName)).apply();
    }

    protected Optional<Food> foodById(FoodId foodId){
        return foods.stream()
                .filter(food -> food.identity().equals(foodId))
                .findFirst();
    }

    protected Optional<Accessories> accessoryById(AccessoryId accessoryId){
        return accessories.stream()
                .filter(accessory -> accessory.identity().equals(accessoryId))
                .findFirst()
    }

    protected Optional<Seller> sellerById(SellerId sellerId){
        return sellers.stream()
                .filter(seller -> seller.identity().equals(sellerId))
                .findFirst();
    }

    public PetShopName getPetShopName() {     return petShopName;
    }

    public Set<Food> getFoods() {
        return foods;
    }

    public Set<Accessories> getAccessories() {
        return accessories;
    }

    public Set<Seller> getSellers() {
        return sellers;
    }
}
