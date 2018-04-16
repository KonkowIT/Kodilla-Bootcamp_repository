package com.kodilla.stream.test;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> strings){
        long count = strings.stream()
                .filter(String::isEmpty)
                .count();
        return count;
    }

    public static long getCountLength3UsingJava8(List<String> strings){
        long count = strings.stream()
                .filter(a -> a.length() == 3)
                .count();
        return count;
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings){
        List<String> count = strings.stream()
                .filter(a -> a.length() > 0)
                .collect(Collectors.toList());
        return count;
    }

    public static String getMergedStringUsingJava8(List<String> strings, String sign){
        String result = strings.stream()
                .filter(a -> a.length() > 0)
                .collect(Collectors.joining(sign));
        return result;
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers){
        List<Integer> result = numbers.stream()
                .distinct()
                .map(a -> a * a)
                .collect(Collectors.toList());
        return result;
    }

    public static Integer getMaxJava8(List<Integer> numbers){
        Integer result = numbers.stream()
                .mapToInt(a -> a)
                .max().getAsInt();
        return result;
    }

    public static Integer getMinJava8(List<Integer> numbers){
        Integer result = numbers.stream()
                .mapToInt(a -> a)
                .min().getAsInt();
        return result;
    }

    public static Integer getSumJava8(List<Integer> numbers){
        Integer result = numbers.stream()
                .mapToInt(a -> a)
                .sum();
        return result;
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
        Integer result = getSumJava8(numbers) / numbers.size();
        return result;
    }
}
