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
        BigDecimal peopleQuantity = new BigDecimal("5704000000");
        //when
        BigDecimal worldPeopleQuantity = world.getWorldPeopleQuantity();
        //then
        Assert.assertEquals(peopleQuantity, worldPeopleQuantity);
    }
}
