package com.sofkaU.ddd.challenge.sale.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PetShopName implements ValueObject<String> {
    private final String value;

    public PetShopName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Pet shop name is empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetShopName that = (PetShopName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
