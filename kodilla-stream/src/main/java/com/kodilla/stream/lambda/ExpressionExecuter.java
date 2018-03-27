package com.kodilla.stream.lambda;

public class ExpressionExecuter {
    public void executerExpression(double a, double b, MathExpression mathExpression){
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("result equals " + result);
    }
}
