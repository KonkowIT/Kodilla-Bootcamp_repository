package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

import static com.sun.tools.doclint.Entity.ne;
import static com.sun.tools.doclint.Entity.sum;

public class World {
    //zawiera kolekcjię kontynetów
    List<Continent> listOfContinents = new ArrayList<>();
    Continent continent;
    Country country = new Country();

    private void listOfContinents(){
        listOfContinents.add(new Continent());
        listOfContinents.add(new Continent());
        listOfContinents.add(new Continent());
        listOfContinents.add(new Continent());
        listOfContinents.add(new Continent());
        listOfContinents.add(new Continent());
        listOfContinents.add(new Continent());
    }

    public List<Continent> getListOfContinents(){
        return listOfContinents;
    }

    public BigDecimal getWorldPeopleQuantity(){
        BigDecimal worldPeopleQuantity = getListOfContinents().stream()
                .flatMap(worldQuantity -> getListOfContinents().stream())
                .flatMap(continentQuantity -> continent.getListOfContinentCountries().stream())
                .map(countryQuantity -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return worldPeopleQuantity;
    }
}
