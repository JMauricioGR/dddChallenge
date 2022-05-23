package com.sofkaU.ddd.challenge.domain.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.EmployeeName;

import java.util.List;

public class UpdateEmployeeName extends Command {

    protected final EmployeeId employeeId;
    protected final EmployeeName employeeName;

    public UpdateEmployeeName(EmployeeId employeeId, EmployeeName employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }
}
