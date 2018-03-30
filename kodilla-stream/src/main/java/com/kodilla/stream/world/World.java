package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static com.sun.tools.doclint.Entity.ne;
import static com.sun.tools.doclint.Entity.sum;

public class World {
    //zawiera kolekcjię kontynetów
    Map<String, Continent> mapOfContinents = new HashMap<>();
    Continent continent = new Continent();
    Country country = new Country();

    public void mapOfContinents(){
        mapOfContinents.put("Europ", new Continent());
        mapOfContinents.put("Asia", new Continent());
        mapOfContinents.put("Antarctica", new Continent());
        mapOfContinents.put("North America", new Continent());
        mapOfContinents.put("South America", new Continent());
        mapOfContinents.put("Australia and Oceania", new Continent());
        mapOfContinents.put("Africa", new Continent());
    }

    public Map<String, Continent> getMapOfContinents(){
        return mapOfContinents;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = mapOfContinents().stream()
                .flatMap(worldQuantity -> mapOfContinents.values().stream())
                .flatMap(continentQuantity -> continent.listOfContinentCountries::get)
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return peopleQuantity;
    }
}
