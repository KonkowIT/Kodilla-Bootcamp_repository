package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    //zawiera listę krajów
    List<Country> listOfContinentCountries = new ArrayList<>();

    public Continent(){
        listOfContinentCountries.add(new Country());
        listOfContinentCountries.add(new Country());
        listOfContinentCountries.add(new Country());
        listOfContinentCountries.add(new Country());
        listOfContinentCountries.add(new Country());
    }

    public List<Country> getListOfContinentCountries() {
        return listOfContinentCountries;
    }
}
