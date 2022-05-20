package com.sofkaU.ddd.challenge.sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Weight implements ValueObject<String> {
    private final String value;

    public Weight(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Weight is empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Objects.equals(value, weight.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
