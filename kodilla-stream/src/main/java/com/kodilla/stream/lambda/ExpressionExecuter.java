package com.kodilla.stream.lambda;

public class ExpressionExecuter {
    public void executerExpression(double a, double b, MathExpression mathExpression){
        double reslut = mathExpression.calculateExpression(a, b);
        System.out.println("result equals" + reslut);
    }
}
