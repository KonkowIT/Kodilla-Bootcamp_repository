package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<GetCountries> listOfContinents = new ArrayList<>();
    GetCountries getCountries;
    Country country;

    public World(){
        listOfContinents.add(new Europe());
        listOfContinents.add(new Asia());
        listOfContinents.add(new NorthAmerica());
    }

    public List<GetCountries> getListOfContinents() { return listOfContinents; }

    public BigDecimal getWorldPeopleQuantity(){
        BigDecimal worldPeopleQuantity = getListOfContinents().stream()
                .flatMap(worldQuantity -> getCountries.getCountriesList().stream())
                .map(countryQuantity -> countryQuantity.getQuantity())
                .reduce(BigDecimal.ZERO, (BigDecimal sum, BigDecimal current) -> sum = sum.add(current));
        return worldPeopleQuantity;
    }
}
