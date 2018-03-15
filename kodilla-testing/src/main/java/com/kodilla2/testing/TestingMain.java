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

       Calculator add = new Calculator(3, 4);

        int a = add.getA();
        int b = add.getB();

        System.out.println("suma " + a + " i " + b + " to " + (a + b));
        System.out.println("różnica " + a + " i " + b + " to " + (a - b));
    }
}

