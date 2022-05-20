package com.sofkaU.ddd.challenge.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeName;

public class Employee extends Entity<EmployeeId> {
    private final EmployeeName employeeName;

    public Employee(EmployeeId entityId, EmployeeName employeeName) {
        super(entityId);
        this.employeeName = employeeName;
    }


}
