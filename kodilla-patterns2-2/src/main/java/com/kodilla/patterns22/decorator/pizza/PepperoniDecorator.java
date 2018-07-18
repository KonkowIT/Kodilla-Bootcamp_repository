package com.kodilla.patterns22.decorator.pizza;

import java.math.BigDecimal;

public class PepperoniDecorator extends AbstractPizzaOrderDecorator {
    protected PepperoniDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "pepperoni, ";
    }
}
