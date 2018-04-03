package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> listOfContinents = new ArrayList<>();
    Country country;
    Continent continent;

    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public List<Continent> getListOfContinents() { return listOfContinents; }

    public BigDecimal getWorldPeopleQuantity(){
        BigDecimal worldPeopleQuantity = getListOfContinents().stream()
                .flatMap(worldQuantity -> continent.listOfCountries.stream())
                .map(countryQuantity -> countryQuantity.getQuantity())
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return worldPeopleQuantity;
    }
}
