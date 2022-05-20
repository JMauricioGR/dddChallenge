package com.sofkaU.ddd.challenge.bathandcare.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeId;
import com.sofkaU.ddd.challenge.bathandcare.values.EmployeeName;

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
