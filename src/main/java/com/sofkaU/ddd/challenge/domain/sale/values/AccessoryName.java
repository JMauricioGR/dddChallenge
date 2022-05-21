package com.sofkaU.ddd.challenge.domain.sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AccessoryName implements ValueObject<String> {
    private final String value;

    public AccessoryName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Accessory name is empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessoryName that = (AccessoryName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
