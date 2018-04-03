package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String nameCountry;
    private BigDecimal quantity;

    public Country(String name, BigDecimal quantity) {
        this.nameCountry = name;
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
    public String getName() { return nameCountry; }
}
