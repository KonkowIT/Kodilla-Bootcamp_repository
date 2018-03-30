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
        List<List<BigDecimal>> world = new ArrayList<>();
        List<BigDecimal> continent = new ArrayList<>();
        BigDecimal countryQuantity = new BigDecimal(123456);
        BigDecimal sumContinent = BigDecimal.ZERO;
        BigDecimal sumWorld = BigDecimal.ZERO;

        //when
        continent.add(countryQuantity);
        continent.add(countryQuantity);
        continent.add(countryQuantity);
        continent.add(countryQuantity);
        continent.add(countryQuantity);

        for(int n = 0; n <= continent.size(); n++){
            sumContinent = sumContinent.add(continent.get(n).);
        }

        world.add(sumContinent);
        world.add(sumContinent);
        world.add(sumContinent);
        world.add(sumContinent);
        world.add(sumContinent);
        world.add(sumContinent);
        world.add(sumContinent);

        for(int n = 0; n <= world.size(); n++){
            sumWorld = sumWorld.add(world.get(n));
        }

        //then
        Assert.assertEquals(countryQuantity, ());
    }
}
