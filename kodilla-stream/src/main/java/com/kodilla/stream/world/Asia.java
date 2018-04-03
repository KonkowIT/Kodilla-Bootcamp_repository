package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Asia {

    Country china = new Country(new BigDecimal("1500000000"));
    Country india = new Country(new BigDecimal("1400000000"));
    Country singapur = new Country(new BigDecimal("800000000"));
    Country japan = new Country(new BigDecimal("300000000"));
    Country tibet = new Country(new BigDecimal("350000000"));

    List<BigDecimal> listOfContinentCountries = new ArrayList<>();

    public Asia() {
        listOfContinentCountries.add(china.getQuantity());
        listOfContinentCountries.add(india.getQuantity());
        listOfContinentCountries.add(singapur.getQuantity());
        listOfContinentCountries.add(japan.getQuantity());
        listOfContinentCountries.add(tibet.getQuantity());
    }

    public List<BigDecimal> getListOfCountries() { return listOfContinentCountries; }
}