package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class ArrayOperations {
    static double getAverage(int[] numbers) {
        double averageNumbers = IntStream
                .range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        return averageNumbers;
    }
}
