package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String name;
    private BigDecimal quantity;

    public Country(String name, BigDecimal quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }
    public String getName() { return name; }
}
