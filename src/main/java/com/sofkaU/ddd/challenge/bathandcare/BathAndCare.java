package com.sofkaU.ddd.challenge.bathandcare;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.bathandcare.events.*;
import com.sofkaU.ddd.challenge.bathandcare.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class BathAndCare extends AggregateEvent<BathAndCareId> {

    protected Set<Client> clients;
    protected Set<Service> services;
    protected Set<Employee> employees;
    protected PetShopName petShopName;

    public BathAndCare(BathAndCareId bathAndCareId, PetShopName petShopName){
        super(bathAndCareId);
        appendChange(new BathAndCareCreated(petShopName)).apply();

    }

    public BathAndCare(BathAndCareId entityId) {
        super(entityId);
        subscribe(new UpdateBathAndCare(this));
    }

    public static BathAndCare from(BathAndCareId bathAndCareId, List<DomainEvent> events){
        var bathAndCare = new BathAndCare(bathAndCareId);
        events.forEach(bathAndCare::applyEvent);
        return bathAndCare;
    }

    public void UpdatePetShopName(PetShopName petShopName){
        Objects.requireNonNull(petShopName);
        appendChange(new PetShopNameUpdated(petShopName)).apply();
    }

    public void AddClient(ClientId clientId, OwnerName ownerName, PetName petName){
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(ownerName);
        Objects.requireNonNull(petName);
        appendChange( new ClientAdded(clientId, ownerName, petName)).apply();
    }

    public void AddService(ServiceId entityId, ServiceName serviceName, ServiceTime serviceTime, Price price){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(serviceName);
        Objects.requireNonNull(serviceTime);
        Objects.requireNonNull(price);
        appendChange(new ServiceAdded(entityId, serviceName, serviceTime, price)).apply();
    }

    public void AddEmployee(EmployeeId entityId, EmployeeName employeeName){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(employeeName);
        appendChange(new EmployeeAdded(entityId, employeeName)).apply();
    }

    public void UpdateOwnerName(OwnerName ownerName){
        Objects.requireNonNull(ownerName);
        appendChange(new OwnerNameUpdated(ownerName)).apply();
    }

    public void UpdatePetName(PetName petName){
        Objects.requireNonNull(petName);
        appendChange(new PetNameUpdated(petName)).apply();
    }

    public void UpdateServiceName(ServiceName serviceName){
        Objects.requireNonNull(serviceName);
        appendChange(new ServiceNameUpdated(serviceName)).apply();
    }

    public void UpdateServiceTime(ServiceTime serviceTime){
        Objects.requireNonNull(serviceTime);
        appendChange(new ServiceTimeUpdated(serviceTime)).apply();
    }

    public void UpdatePrice(Price price){
        Objects.requireNonNull(price);
        appendChange(new PriceUpdated(price)).apply();
    }

    public void UpdateEmployeeName(EmployeeName employeeName){
        Objects.requireNonNull(employeeName);
        appendChange(new EmployeeNameUpdated(employeeName)).apply();
    }

    protected Optional<Client> clientById(ClientId clientId){
        return clients
                .stream()
                .filter(client -> client.identity().equals(clientId))
                .findFirst();
    }

    protected Optional<Service> serviceById(ServiceId serviceId){
        return services
                .stream()
                .filter(service -> service.identity().equals(serviceId))
                .findFirst();
    }

    protected Optional<Employee> employeeById(EmployeeId employeeId){
        return employees
                .stream()
                .filter(employee -> employee.identity().equals(employeeId))
                .findFirst();
    }

    public PetShopName getPetShopName() {
        return petShopName;
    }
}
