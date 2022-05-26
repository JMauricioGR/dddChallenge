package com.sofkaU.ddd.challenge.domain.bathandcare;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.*;

import java.util.HashSet;
import java.util.Set;

public class UpdateBathAndCare extends EventChange {
    public UpdateBathAndCare(BathAndCare bathAndCare) {
        apply((BathAndCareCreated event) ->{
            bathAndCare.petShopName = event.getPetShopName();
            bathAndCare.services = new HashSet<>();
            bathAndCare.clients = new HashSet<>();
            bathAndCare.employees = new HashSet<>();
        });

        apply((EmployeeAdded event) ->{
            bathAndCare.employees.add(new Employee(
                    event.getEntityId(),
                    event.getEmployeeName()
            ));
        });

        apply((EmployeeNameUpdated event) ->{
            var employeeName = bathAndCare.employeeById(event.getEmployeeId())
                    .orElseThrow(() -> new IllegalArgumentException("Employee doesn´t found"));
            employeeName.UpdateEmployeeName(event.getEmployeeId(), event.getEmployeeName());
        });

        apply((OwnerNameUpdated event) -> {
            var ownerName = bathAndCare.clientById(event.getClientId())
                    .orElseThrow(()-> new IllegalArgumentException("Client doesn't found"));
            ownerName.UpdateOwnerName(event.getOwnerName());
        });

        apply((PetNameUpdated event) -> {
            var petName = bathAndCare.clientById(event.getClientId())
                    .orElseThrow(()-> new IllegalArgumentException("Client doesn't found"));
            petName.UpdatePetName(event.getPetName());
        });

        apply((PetShopNameUpdated event) -> {
            bathAndCare.petShopName = event.getPetShopName();
        });

        apply((PriceUpdated event) -> {
            var priceUpdt = bathAndCare.serviceById(event.getServiceId())
                    .orElseThrow(()-> new IllegalArgumentException("Service doesn't found"));
            priceUpdt.UpdatePrice(event.getPrice());
        });

        apply((ServiceAdded event) -> {

            bathAndCare.services.add(new Service(
                    event.getEntityId(),
                    event.getServiceName(),
                    event.getServiceTime(),
                    event.getPrice()
            ));
        });

        apply((ServiceNameUpdated event) -> {
            var serviceName = bathAndCare.serviceById(event.getServiceId())
                    .orElseThrow(()-> new IllegalArgumentException("Service doesn't found"));
            serviceName.UpdateServiceName(event.getServiceName());
        });

        apply((ServiceTimeUpdated event) ->{
            var serviceTime = bathAndCare.serviceById(event.getServiceId())
                    .orElseThrow(()-> new IllegalArgumentException("Service doesn't found"));
            serviceTime.UpdateServiceTime(event.getServiceTime());
        });

        apply((ClientAdded event) -> {
            bathAndCare.clients.add(new Client(
                    event.getClientId(),
                    event.getOwnerName(),
                    event.getPetName()
            ));
        });

    }
}
