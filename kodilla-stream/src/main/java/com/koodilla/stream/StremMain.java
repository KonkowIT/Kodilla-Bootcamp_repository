package com.koodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecuter;
import com.kodilla.stream.lambda.Processor;

public class StremMain {
    public static void main(String[] args) {
        ExpressionExecuter expressionExecuter = new ExpressionExecuter();

        expressionExecuter.executerExpression(10,5, (a, b) -> a + b);
        expressionExecuter.executerExpression(10,5, (a, b) -> a - b);
        expressionExecuter.executerExpression(10,5, (a, b) -> a * b);
        expressionExecuter.executerExpression(10,5, (a, b) -> a / b);
    }
}
