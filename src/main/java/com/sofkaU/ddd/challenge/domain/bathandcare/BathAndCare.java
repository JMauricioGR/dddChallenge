package com.sofkaU.ddd.challenge.domain.bathandcare;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.ddd.challenge.domain.bathandcare.events.*;
import com.sofkaU.ddd.challenge.domain.bathandcare.values.*;

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
        this(bathAndCareId);
        appendChange(new BathAndCareCreated(petShopName)).apply();

    }

    public BathAndCare(BathAndCareId bathAndCareId) {
        super(bathAndCareId);
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

    public void AddClient(BathAndCareId bathAndCareId, ClientId clientId, OwnerName ownerName, PetName petName){
        Objects.requireNonNull(bathAndCareId);
        Objects.requireNonNull(clientId);
        Objects.requireNonNull(ownerName);
        Objects.requireNonNull(petName);
        appendChange( new ClientAdded(bathAndCareId,clientId, ownerName, petName)).apply();
    }

    public void AddService(BathAndCareId bathAndCareId, ServiceId entityId, ServiceName serviceName, ServiceTime serviceTime, Price price){
        Objects.requireNonNull(bathAndCareId);
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(serviceName);
        Objects.requireNonNull(serviceTime);
        Objects.requireNonNull(price);
        appendChange(new ServiceAdded(bathAndCareId,entityId, serviceName, serviceTime, price)).apply();
    }

    public void AddEmployee(BathAndCareId bathAndCareId, EmployeeId entityId, EmployeeName employeeName){
        Objects.requireNonNull(bathAndCareId);
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(employeeName);
        appendChange(new EmployeeAdded(bathAndCareId, entityId, employeeName)).apply();
    }

    public void UpdateOwnerName(ClientId clientId,OwnerName ownerName){
        Objects.requireNonNull(ownerName);
        Objects.requireNonNull(clientId);
        appendChange(new OwnerNameUpdated(clientId, ownerName)).apply();
    }

    public void UpdatePetName(ClientId clientId, PetName petName){
        Objects.requireNonNull(petName);
        Objects.requireNonNull(clientId);
        appendChange(new PetNameUpdated(clientId, petName)).apply();
    }

    public void UpdateServiceName(ServiceId serviceId,ServiceName serviceName){
        Objects.requireNonNull(serviceName);
        Objects.requireNonNull(serviceId);
        appendChange(new ServiceNameUpdated(serviceId, serviceName)).apply();
    }

    public void UpdateServiceTime(ServiceId serviceId, ServiceTime serviceTime){
        Objects.requireNonNull(serviceTime);
        Objects.requireNonNull(serviceId);
        appendChange(new ServiceTimeUpdated(serviceId, serviceTime)).apply();
    }

    public void UpdatePrice(ServiceId serviceId, Price price){
        Objects.requireNonNull(price);
        Objects.requireNonNull(serviceId);
        appendChange(new PriceUpdated(serviceId, price)).apply();
    }

    public void UpdateEmployeeName(EmployeeId employeeId, EmployeeName employeeName){
        Objects.requireNonNull(employeeName);
        Objects.requireNonNull(employeeId);
        appendChange(new EmployeeNameUpdated(employeeId, employeeName)).apply();
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

    public Set<Client> getClients() {
        return clients;
    }

    public Set<Service> getServices() {
        return services;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }
}
