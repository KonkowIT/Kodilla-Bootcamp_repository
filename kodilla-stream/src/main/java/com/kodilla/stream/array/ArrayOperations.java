package com.kodilla.stream.array;

public class ArrayOperations {
    static double getAverage(int[] numbers) {
        int averageNumbers = getAverage(numbers).IntStream()
                .range(0, numbers.length)
                .forEach(n -> numbers[n])
                .average();

        return averageNumbers;
    }
}
