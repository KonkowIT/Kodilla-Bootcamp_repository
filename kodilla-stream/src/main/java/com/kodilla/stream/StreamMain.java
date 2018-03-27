package com.kodilla.stream;

import com.kodilla.stream.beautifier.DecorateMethods;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecuter;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecuter expressionExecuter = new ExpressionExecuter(); //tworzenie obiektu klasy expressionExecuter

        System.out.println("Calculating expressions with lambdas");
        expressionExecuter.executerExpression(10, 5, (a, b) -> a + b);
        expressionExecuter.executerExpression(10, 5, (a, b) -> a - b);
        expressionExecuter.executerExpression(10, 5, (a, b) -> a * b);
        expressionExecuter.executerExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with referencess ");
        expressionExecuter.executerExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecuter.executerExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecuter.executerExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecuter.executerExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("My House", DecorateMethods::addAtBegining);
        poemBeautifier.beautify("My House", DecorateMethods::addAtEnd);
        poemBeautifier.beautify("My House", DecorateMethods::toUpperCase);
        poemBeautifier.beautify("My House", DecorateMethods::toLowerCase);
    }
}