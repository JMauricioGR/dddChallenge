package com.sofkaU.ddd.challenge.domain.bathandcare;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

import java.util.Objects;

public class Employee extends Entity<EmployeeId> {
    private EmployeeName employeeName;

    public Employee(EmployeeId entityId, EmployeeName employeeName) {
        super(entityId);
        this.employeeName = employeeName;
    }

    public void UpdateEmployeeName(EmployeeId employeeId, EmployeeName employeeName){
        this.employeeName = Objects.requireNonNull(employeeName);
        this.entityId = Objects.requireNonNull(employeeId);
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }
}
