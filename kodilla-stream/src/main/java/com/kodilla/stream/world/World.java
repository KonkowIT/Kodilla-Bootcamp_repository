package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class World {
    //zawiera kolekcjię kontynetów
    Map<String, Continent> mapOfContinents = new HashMap<>();

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
        BigDecimal peopleQuantity = World.getMapOfContinents.stream()
                .flatMap(World -> World.getMapOfContinents.getListOfContinentCountries().stream())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }
}
