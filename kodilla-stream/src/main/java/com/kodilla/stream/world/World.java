package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> listOfContinents = new ArrayList<>();


    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public List<Continent> getListOfContinents() { return listOfContinents; }

    public BigDecimal getWorldPeopleQuantity(){
        BigDecimal worldPeopleQuantity = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(countryQuantity -> countryQuantity.getQuantity())
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return worldPeopleQuantity;
    }
}
