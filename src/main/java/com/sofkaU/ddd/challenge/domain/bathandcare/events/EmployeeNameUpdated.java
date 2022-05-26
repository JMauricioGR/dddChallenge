package com.sofkaU.ddd.challenge.domain.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

public class EmployeeNameUpdated extends DomainEvent {
    private final BathAndCareId bathAndCareId;
    private final EmployeeId employeeId;
    private final EmployeeName employeeName;

    public EmployeeNameUpdated(BathAndCareId bathAndCareId, EmployeeId employeeId, EmployeeName employeeName) {
        super("sofka.bathandcare.employeenameupdated");
        this.bathAndCareId = bathAndCareId;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public BathAndCareId getBathAndCareId() {
        return bathAndCareId;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }
}
