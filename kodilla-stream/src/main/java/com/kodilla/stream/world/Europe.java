package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Europe {

    Country poland = new Country(new BigDecimal("42000000"));
    Country germany = new Country(new BigDecimal("70000000"));
    Country france = new Country(new BigDecimal("60000000"));
    Country netherlands = new Country(new BigDecimal("25000000"));
    Country greece = new Country(new BigDecimal("35000000"));

    List<BigDecimal> listOfContinentCountries = new ArrayList<>();

    public Europe() {
        listOfContinentCountries.add(poland.getQuantity());
        listOfContinentCountries.add(germany.getQuantity());
        listOfContinentCountries.add(france.getQuantity());
        listOfContinentCountries.add(netherlands.getQuantity());
        listOfContinentCountries.add(greece.getQuantity());
    }

    public List<BigDecimal> getListOfCountries() {
        return listOfContinentCountries;
    }
}
