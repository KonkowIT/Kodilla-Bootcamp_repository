package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testCostGarlicSauceCheeseHamCornPizza() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        //when
        BigDecimal pizzaCost = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(21), pizzaCost);
    }

    @Test
    public void testDescriptionGarlicSauceCheeseHamCornPizza() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        //when
        String description = pizzaOrder.getDescription();
        //then
        assertEquals("Tasty pizza with: garlic sauce, cheese, ham, corn, ", description);
    }

    @Test
    public void testCostAllIngredientsPizza() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new TomatoSauceDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        //when
        BigDecimal pizzaCost = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(26), pizzaCost);
    }

    @Test
    public void testDescriptionAllIngredientsPizza() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new GarlicSauceDecorator(pizzaOrder);
        pizzaOrder = new TomatoSauceDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new CornDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        pizzaOrder = new PepperoniDecorator(pizzaOrder);
        //when
        String description = pizzaOrder.getDescription();
        //then
        assertEquals("Tasty pizza with: garlic sauce, tomato sauce, cheese, ham, corn, tomato, pepperoni, ",
                description);
    }
}
