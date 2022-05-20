package com.sofkaU.ddd.challenge.bathandcare;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.ddd.challenge.bathandcare.BathAndCare;
import com.sofkaU.ddd.challenge.bathandcare.events.BathAndCareCreated;
import com.sofkaU.ddd.challenge.bathandcare.events.ClientAdded;
import com.sofkaU.ddd.challenge.bathandcare.events.EmployeeAdded;
import com.sofkaU.ddd.challenge.bathandcare.events.EmployeeNameUpdated;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeId;

public class UpdateBathAndCare extends EventChange {
    public UpdateBathAndCare(BathAndCare bathAndCare) {
        apply((BathAndCareCreated event) ->{
            bathAndCare.petShopName = event.getPetShopName();
        });

        apply((EmployeeAdded event) ->{
            var employees = bathAndCare.employees.size();
            if(employees == 0 ){
                throw new IllegalArgumentException("Employee not found");
            }
        });
    }
}
