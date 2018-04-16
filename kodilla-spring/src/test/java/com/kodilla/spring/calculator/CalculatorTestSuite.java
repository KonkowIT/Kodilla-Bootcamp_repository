package com.kodilla.spring.calculator;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        calculator.add(4, 4);
        calculator.div(4, 4);
        calculator.mul(4, 4);
        calculator.sub(4, 4);
        //then
        //do nothing
    }
}
