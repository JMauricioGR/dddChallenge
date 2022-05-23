package com.sofkaU.ddd.challenge.domain.bathandcare.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PetName implements ValueObject<String> {
    private final String value;

    public PetName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Pet name is empty");
        }
    }


    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetName petName = (PetName) o;
        return Objects.equals(value, petName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
