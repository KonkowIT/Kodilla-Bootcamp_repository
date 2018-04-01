package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

import static com.sun.tools.doclint.Entity.ne;
import static com.sun.tools.doclint.Entity.sum;

public class World {
    //zawiera kolekcjię kontynetów
    List<Continent> listOfContinents = new ArrayList<>();
    Continent continent;

    public List<Continent> getListOfContinents(int n) {
        for (int i = 0; i == n; i++) {
            listOfContinents.add(new Continent());
        }
        return listOfContinents;
    }

    public BigDecimal getWorldPeopleQuantity(int n){
        BigDecimal worldPeopleQuantity = getListOfContinents(n).stream()
                .flatMap(worldQuantity -> continent.getListOfContinentCountries().stream())
                .map(getCountry -> continent.getListOfContinentCountries().get(0))
                .map(getQuantity -> continent.getListOfContinentCountries().get(0).getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return worldPeopleQuantity;
    }
}
