package com.sofkaU.ddd.challenge.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeName;

import java.util.Objects;

public class Employee extends Entity<EmployeeId> {
    private EmployeeName employeeName;

    public Employee(EmployeeId entityId, EmployeeName employeeName) {
        super(entityId);
        this.employeeName = employeeName;
    }

    public void UpdateEmployeeName(EmployeeName employeeName){
        this.employeeName = Objects.requireNonNull(employeeName);
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }
}
