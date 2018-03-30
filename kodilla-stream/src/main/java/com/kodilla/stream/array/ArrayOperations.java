package com.kodilla.stream.array;

public class ArrayOperations {
    static double getAverage(int[] numbers) {
        numbers[0] = 2;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 3;
        numbers[5] = 6;
        numbers[6] = 4;
        numbers[7] = 3;
        numbers[8] = 5;
        numbers[9] = 3;

        int averageNumbers = getAverage().IntStream()
                .range(numbers[0], numbers[9])
                .map(System.out::println)
                .average();

        return averageNumbers;
    }
}
