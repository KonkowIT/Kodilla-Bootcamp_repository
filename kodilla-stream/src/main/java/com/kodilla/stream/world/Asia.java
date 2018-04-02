package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Asia {

    China china = new China();
    India india = new India();
    Japan japan = new Japan();
    Singapur singapur = new Singapur();
    Vietnam vietnam = new Vietnam();

    List<BigDecimal> listOfAsiaCountries = new ArrayList<>();

    public Asia(){
        listOfAsiaCountries.add(china.getQuantity());
        listOfAsiaCountries.add(india.getQuantity());
        listOfAsiaCountries.add(japan.getQuantity());
        listOfAsiaCountries.add(singapur.getQuantity());
        listOfAsiaCountries.add(vietnam.getQuantity());
    }

    public List<BigDecimal> getListOfCountries() {
        return listOfAsiaCountries;
    }
}
