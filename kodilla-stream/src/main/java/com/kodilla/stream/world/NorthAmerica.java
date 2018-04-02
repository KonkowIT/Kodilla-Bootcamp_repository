package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NorthAmerica {

    USA usa = new USA();
    Mexico mexico = new Mexico();
    Canada canada = new Canada();
    Jamaica jamaica = new Jamaica();
    Cuba cuba = new Cuba();

    List<BigDecimal> listOfNorthAmericaCountries = new ArrayList<>();

    public NorthAmerica(){
        listOfNorthAmericaCountries.add(usa.getQuantity());
        listOfNorthAmericaCountries.add(mexico.getQuantity());
        listOfNorthAmericaCountries.add(canada.getQuantity());
        listOfNorthAmericaCountries.add(jamaica.getQuantity());
        listOfNorthAmericaCountries.add(cuba.getQuantity());
    }

    public List<BigDecimal> getListOfCountries() {
        return listOfNorthAmericaCountries;
    }

}
