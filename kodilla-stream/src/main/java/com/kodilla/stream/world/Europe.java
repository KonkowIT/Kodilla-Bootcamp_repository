package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Europe {

    Poland poland = new Poland();
    Germany germany = new Germany();
    France france = new France();
    Netherlands netherlands = new Netherlands();
    Greece greece = new Greece();

    List<BigDecimal> listOfEuropeCountries = new ArrayList<>();

    public Europe(){
        listOfEuropeCountries.add(poland.getQuantity());
        listOfEuropeCountries.add(germany.getQuantity());
        listOfEuropeCountries.add(france.getQuantity());
        listOfEuropeCountries.add(netherlands.getQuantity());
        listOfEuropeCountries.add(greece.getQuantity());
    }

    public List<BigDecimal> getListOfCountries() {
        return listOfEuropeCountries;
    }
}