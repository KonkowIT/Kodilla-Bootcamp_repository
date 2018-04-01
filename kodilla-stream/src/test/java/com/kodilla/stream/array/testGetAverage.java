package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class testGetAverage {
    @Test
    public void testGetAverage() {
        //given
        int[] numbers = new int[10];
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

        //when
        //double streamAverage = ArrayOperations.getAverage(numbers);
        double sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum/numbers.length;

        //then
        //Assert.assertEquals(average, streamAverage, 0.001);
    }
}
