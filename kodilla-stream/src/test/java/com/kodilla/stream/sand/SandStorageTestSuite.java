package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {

    @Test
    public void getSandBeansQuantity(){
        //given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());

        //when
        BigDecimal totalSand = BigDecimal.ZERO;
        for(SandStorage continent : continents){
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Africa());
        continents.add(new Asia());

        //when
        BigDecimal totalSand = continents.stream()      //uruchomiony zostaje strumień nakolekcji, zostanie przypsany do zmiennej totalSand typu BigDecimal
                .map(SandStorage::getSandBeansQuantity)     //zmienia obiekty w strumieniu (z klas reprezentujących kontynenty na liczby typu BigDecimal)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));     //reduce(WARTOŚĆ_POCZĄTKOWA, WYRAŻENIE WYKONYWANE DLA KAŻDEJ LICZBY Z KOLEKCJI)
                                                                                        //sum - pośredni wynik uzyskany dla poprzedniego obiektu
                                                                                        //na koniec liczba zostaje zwrócona do zmiennej totalSand

        ///then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }
}
