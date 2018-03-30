package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

import static com.sun.tools.doclint.Entity.ne;
import static com.sun.tools.doclint.Entity.sum;

public class World {
    //zawiera kolekcjię kontynetów
    List<Continent> mapOfContinents = new ArrayList<>();
    Continent continent;
    Country country;

    public void mapOfContinents(){
        mapOfContinents.add(new Continent());
        mapOfContinents.add(new Continent());
        mapOfContinents.add(new Continent());
        mapOfContinents.add(new Continent());
        mapOfContinents.add(new Continent());
        mapOfContinents.add(new Continent());
        mapOfContinents.add(new Continent());
    }

    public List<Continent> getMapOfContinents(){
        return mapOfContinents;
    }

 /*   public BigDecimal getWorldPeopleQuantity(){
        BigDecimal worldPeopleQuantity = getMapOfContinents().stream()
                .flatMap(worldQuantity -> getMapOfContinents().stream())
                .flatMap(continentQuantity -> continent.getListOfContinentCountries())
                .map(countryQuantity -> Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return peopleQuantity;
    }*/
}
