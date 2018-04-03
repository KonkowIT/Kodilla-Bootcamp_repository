package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    String nameContinent;
    List<Country> listOfCountries;

    public Continent(String nameContinent, List<Country> listOfCountries) {
        this.nameContinent = nameContinent;
        this.listOfCountries = listOfCountries;
    }

    public String getNameContinent() {
        return nameContinent;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
