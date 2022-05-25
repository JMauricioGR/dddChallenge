package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.BathAndCareId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

public class AddEmployee extends Command {

    private final BathAndCareId bathAndCareId;
    protected final EmployeeId entityId;
    protected final EmployeeName employeeName;

    public AddEmployee(BathAndCareId bathAndCareId, EmployeeId entityId, EmployeeName employeeName){
        this.bathAndCareId = bathAndCareId;
        this.entityId = entityId;
        this.employeeName = employeeName;
    }

    public BathAndCareId getBathAndCareId() {
        return bathAndCareId;
    }

    public EmployeeId getEntityId() {
        return entityId;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }
}
