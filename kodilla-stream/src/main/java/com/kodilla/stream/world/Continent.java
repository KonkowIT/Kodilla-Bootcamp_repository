package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    String nameContinent;
    private List<Country> listOfCountries = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }
}
