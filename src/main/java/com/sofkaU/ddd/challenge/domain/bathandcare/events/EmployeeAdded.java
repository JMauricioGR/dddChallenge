package com.sofkaU.ddd.challenge.domain.bathandcare.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

public class EmployeeAdded extends DomainEvent {
    private final BathAndCareId bathAndCareId;
    private final EmployeeId entityId;
    private final EmployeeName employeeName;

    public EmployeeAdded(BathAndCareId bathAndCareId, EmployeeId entityId, EmployeeName employeeName) {
        super("sokau.bathandcare.employeeadded");
        this.bathAndCareId = bathAndCareId;
        this.entityId = entityId;
        this.employeeName = employeeName;
    }

    public EmployeeId getEntityId() {
        return entityId;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }
}
