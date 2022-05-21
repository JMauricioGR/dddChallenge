package com.sofkaU.ddd.challenge.domain.bathandcare.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ServiceTime implements ValueObject<String> {
    private final String value;

    public ServiceTime(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Pet name is empty");
        }
    }


    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceTime that = (ServiceTime) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
