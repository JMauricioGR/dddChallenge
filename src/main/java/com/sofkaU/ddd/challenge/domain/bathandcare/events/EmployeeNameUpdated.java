package com.sofkaU.ddd.challenge.domain.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

public class EmployeeNameUpdated extends DomainEvent {
    private final EmployeeId employeeId;
    private final EmployeeName employeeName;

    public EmployeeNameUpdated(EmployeeId employeeId,EmployeeName employeeName) {
        super("sofka.bathandcare.employeenameupdated");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }
}
