package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

public class AddEmployee extends Command {

    protected final EmployeeId entityId;
    protected final EmployeeName employeeName;

    public AddEmployee(EmployeeId entityId, EmployeeName employeeName){
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
