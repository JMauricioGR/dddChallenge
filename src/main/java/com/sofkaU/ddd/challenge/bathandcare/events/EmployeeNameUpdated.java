package com.sofkaU.ddd.challenge.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeName;

public class EmployeeNameUpdated extends DomainEvent {
    private final EmployeeName employeeName;

    public EmployeeNameUpdated(EmployeeName employeeName) {
        super("sofka.bathandcare.employeenameupdated");
        this.employeeName = employeeName;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }
}
