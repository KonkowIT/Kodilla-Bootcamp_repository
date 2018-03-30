package com.kodilla.stream.array;

class AverageLoop {
    public static void main (String[] args) throws java.lang.Exception {
        int[] marks = new int[20];
        marks[0] = 2;
        marks[1] = 4;
        marks[2] = 5;
        marks[3] = 3;
        marks[4] = 4;
        marks[5] = 5;
        marks[6] = 4;
        marks[7] = 3;
        marks[8] = 5;
        marks[8] = 6;
        marks[9] = 6;
        marks[10] = 3;
        marks[11] = 5;
        marks[12] = 3;
        marks[13] = 5;
        marks[14] = 3;
        marks[15] = 4;
        marks[16] = 4;
        marks[17] = 3;
        marks[18] = 4;
        marks[19] = 5;

        double sum = 0;
        for(int i=0; i<marks.length; i++) {
            System.out.println("mark number [" + i + "] = " + marks[i]);
            sum += marks[i];
        }

        double average = sum/marks.length;
        System.out.println("\nAverage of my marks is " + average);
    }
}