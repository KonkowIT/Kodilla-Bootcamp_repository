package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //given
        World world = new World();
        Continent europe = new Continent("Europe");

        europe.addCountry(new Country("Poland", new BigDecimal("42000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("70000000")));
        europe.addCountry(new Country("France", new BigDecimal("60000000")));
        europe.addCountry(new Country("Netherlands", new BigDecimal("25000000")));
        europe.addCountry(new Country("Greece", new BigDecimal("35000000")));
        world.addContinent(europe);

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1500000000")));
        asia.addCountry(new Country("India", new BigDecimal("1400000000")));
        asia.addCountry(new Country("Singapur", new BigDecimal("800000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("300000000")));
        asia.addCountry(new Country("Tibet",new BigDecimal("350000000")));
        world.addContinent(asia);

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new Country("USA", new BigDecimal("500000000")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("250000000")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("300000000")));
        northAmerica.addCountry(new Country("Jamaica", new BigDecimal("42000000")));
        northAmerica.addCountry(new Country("Cuba", new BigDecimal("30000000")));
        world.addContinent(northAmerica);

        //when
        BigDecimal peopleQuantity = new BigDecimal("5704000000");
        BigDecimal worldPeopleQuantity = world.getWorldPeopleQuantity();
        //then
        Assert.assertEquals(peopleQuantity, worldPeopleQuantity);
    }
}
