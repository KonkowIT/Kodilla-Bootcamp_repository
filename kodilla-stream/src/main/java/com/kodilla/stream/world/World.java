package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    //zawiera kolekcjię kontynetów
    List<List> listOfContinents = new ArrayList<>();

    private Europe europe = new Europe();
    private Asia asia = new Asia();
    private NorthAmerica northAmerica = new NorthAmerica();

    public World(){
        listOfContinents.add(europe.getListOfCountries());
        listOfContinents.add(asia.getListOfCountries());
        listOfContinents.add(northAmerica.getListOfCountries());
    }

    public List<List> getListOfContinents() {
        return listOfContinents;
    }

    /*public BigDecimal getWorldPeopleQuantity(){
        BigDecimal worldPeopleQuantity = getListOfContinents().stream()
                .flatMap(worldQuantity -> worldQuantity.getListOfCountries().stream())
                .map(getCountry -> getCountry.getQuantity())
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return worldPeopleQuantity;
    }*/
}
