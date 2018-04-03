package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Asia implements GetCountries{

    public List<Country> listOfCountries = new ArrayList<>();
    public Country country;

    public Asia() {
        listOfCountries.add(country = new Country("China", new BigDecimal("1500000000")));
        listOfCountries.add(country = new Country("India", new BigDecimal("1400000000")));
        listOfCountries.add(country = new Country("Singapur", new BigDecimal("800000000")));
        listOfCountries.add(country = new Country("Japan", new BigDecimal("300000000")));
        listOfCountries.add(country = new Country("Tibet",new BigDecimal("350000000")));
    }

    //4 350 000 000

    @Override
    public List<Country> getCountriesList() { return listOfCountries; }
}