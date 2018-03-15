package com.kodilla2.testing;

import com.kodilla2.testing.user.SimpleUser;
import com.kodilla2.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
       SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("Test OK");
        }
        else {
            System.out.println("Error!");
        }

       Calculator calc = new Calculator(3, 4);

        System.out.println("suma " + calc.getA() + " i " + calc.getB() + " to " + calc.add(calc.getA(), calc.getB()));
        System.out.println("różnica " + calc.getA() + " i " + calc.getB() + " to " + calc.substract(calc.getA(), calc.getB()));

        int resultA = calc.getA();
        int resultB = calc.getB();


        if (resultA == 3 && resultB == 4){
            System.out.println("Test ok");
        }
        else {
            System.out.println("Error");
        }
    }
}

