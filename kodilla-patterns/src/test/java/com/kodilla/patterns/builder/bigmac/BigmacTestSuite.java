package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("cheese")
                .ingredient("bacon")
                .ingredient("tomato")
                .ingredient("pickle")
                .ingredient("mayo")
                .build();
        System.out.println(bigmac);
        //when
        Assert.assertEquals("bun", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("1000 islands", bigmac.getSauce());
        Assert.assertEquals(5, bigmac.getIngredients().size());
    }
}
