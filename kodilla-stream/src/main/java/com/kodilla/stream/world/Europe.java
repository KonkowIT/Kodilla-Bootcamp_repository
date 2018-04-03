package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Europe implements GetCountries{

    public List<Country> listOfCountries = new ArrayList<>();
    public Country country;

    public Europe() {
        listOfCountries.add(country = new Country("Poland", new BigDecimal("42000000")));
        listOfCountries.add(country = new Country("Germany", new BigDecimal("70000000")));
        listOfCountries.add(country = new Country("France", new BigDecimal("60000000")));
        listOfCountries.add(country = new Country("Netherlands", new BigDecimal("25000000")));
        listOfCountries.add(country = new Country("Greece", new BigDecimal("35000000")));
    }

    //232 000 000

    @Override
    public List<Country> getCountriesList() { return listOfCountries; }
}
