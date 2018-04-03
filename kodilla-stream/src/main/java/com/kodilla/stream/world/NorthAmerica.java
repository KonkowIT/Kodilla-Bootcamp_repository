package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NorthAmerica implements GetCountries{

    public List<Country> listOfCountries = new ArrayList<>();
    public Country country;

    public NorthAmerica() {
        listOfCountries.add(country = new Country("USA", new BigDecimal("500000000")));
        listOfCountries.add(country = new Country("Mexico", new BigDecimal("250000000")));
        listOfCountries.add(country = new Country("Canada", new BigDecimal("300000000")));
        listOfCountries.add(country = new Country("Jamaica", new BigDecimal("42000000")));
        listOfCountries.add(country = new Country("Cuba", new BigDecimal("30000000")));
    }

    //1 122 000 000

    @Override
    public List<Country> getCountriesList() { return listOfCountries; }
}
