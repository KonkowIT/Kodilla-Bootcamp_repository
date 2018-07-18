package com.kodilla.patterns22.decorator.pizza;

import java.math.BigDecimal;

public class TomatoSauceDecorator extends AbstractPizzaOrderDecorator {
    protected TomatoSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "tomato sauce, ";
    }
}
