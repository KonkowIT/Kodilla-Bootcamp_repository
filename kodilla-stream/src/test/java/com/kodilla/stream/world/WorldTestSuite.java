package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //given
        World world = new World();
        Country country;
        Continent continent;

        /*world.addContinent(new Continent("Europe", continent.listOfCountries));
        continent.listOfCountries.add(new Country("Poland", new BigDecimal("42000000")));
        continent.listOfCountries.add(new Country("Germany", new BigDecimal("70000000")));
        continent.listOfCountries.add(new Country("France", new BigDecimal("60000000")));
        continent.listOfCountries.add(new Country("Netherlands", new BigDecimal("25000000")));
        continent.listOfCountries.add(new Country("Greece", new BigDecimal("35000000")));

        world.addContinent(new Continent("Asia", continent.listOfCountries));
        continent.listOfCountries.add(new Country("China", new BigDecimal("1500000000")));
        continent.listOfCountries.add(new Country("India", new BigDecimal("1400000000")));
        continent.listOfCountries.add(new Country("Singapur", new BigDecimal("800000000")));
        continent.listOfCountries.add(new Country("Japan", new BigDecimal("300000000")));
        continent.listOfCountries.add(new Country("Tibet",new BigDecimal("350000000")));

        world.addContinent(new Continent("North America", continent.listOfCountries));
        continent.listOfCountries.add(new Country("USA", new BigDecimal("500000000")));
        continent.listOfCountries.add(new Country("Mexico", new BigDecimal("250000000")));
        continent.listOfCountries.add(new Country("Canada", new BigDecimal("300000000")));
        continent.listOfCountries.add(new Country("Jamaica", new BigDecimal("42000000")));
        continent.listOfCountries.add(new Country("Cuba", new BigDecimal("30000000")));

        //when
        BigDecimal peopleQuantity = new BigDecimal("5704000000");
        BigDecimal worldPeopleQuantity = world.getWorldPeopleQuantity();
        //then
        Assert.assertEquals(peopleQuantity, worldPeopleQuantity);*/
    }
}
