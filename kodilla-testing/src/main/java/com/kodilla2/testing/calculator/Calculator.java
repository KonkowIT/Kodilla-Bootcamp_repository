package com.kodilla2.testing.calculator;

public class Calculator {

    public int a;
    public int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b){
        return getA()+getB();
    }

    public int substract(int a, int b){
        return getA()-getB();
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }
}
