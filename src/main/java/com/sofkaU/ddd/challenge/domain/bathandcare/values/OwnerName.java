package com.sofkaU.ddd.challenge.domain.bathandcare.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class OwnerName implements ValueObject<String> {
    private final  String value;

    public OwnerName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Owner name is empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerName ownerName = (OwnerName) o;
        return Objects.equals(value, ownerName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
