package com.sofkaU.ddd.challenge.domain.bathandcare;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.*;

public class UpdateBathAndCare extends EventChange {
    public UpdateBathAndCare(BathAndCare bathAndCare) {
        apply((BathAndCareCreated event) ->{
            bathAndCare.petShopName = event.getPetShopName();
        });

        apply((EmployeeAdded event) ->{
            var employees = bathAndCare.employees.size();
            if(employees == 0 ){
                throw new IllegalArgumentException("No data to save");
            }
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
            var serviceAdd = bathAndCare.services.size();
            if (serviceAdd == 0){
                throw  new IllegalArgumentException("No data to save");
            }
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

    }
}
