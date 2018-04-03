package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NorthAmerica {

    Country usa = new Country(new BigDecimal("500000000"));
    Country mexico = new Country(new BigDecimal("250000000"));
    Country canada = new Country(new BigDecimal("300000000"));
    Country jamaica = new Country(new BigDecimal("42000000"));
    Country cuba = new Country(new BigDecimal("30000000"));

    List<BigDecimal> listOfContinentCountries = new ArrayList<>();

    public NorthAmerica(){
        listOfContinentCountries.add(usa.getQuantity());
        listOfContinentCountries.add(mexico.getQuantity());
        listOfContinentCountries.add(canada.getQuantity());
        listOfContinentCountries.add(jamaica.getQuantity());
        listOfContinentCountries.add(cuba.getQuantity());
    }

    public List<BigDecimal> getListOfCountries() {
        return listOfContinentCountries;
    }
}
