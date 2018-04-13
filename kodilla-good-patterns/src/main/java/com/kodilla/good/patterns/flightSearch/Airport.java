package com.kodilla.good.patterns.flightSearch;

import java.util.Objects;

public class Airport {
    private String town;

    public Airport(String town) {
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(town, airport.town);
    }

    @Override
    public int hashCode() {

        return Objects.hash(town);
    }
}
