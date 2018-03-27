package com.kodilla.stream.beautifier;

public class DecorateMethods{

    public static String addAtBegining(String toBeautify){
        String result = "ABC" + toBeautify;
        return result;
    }

    public static String addAtEnd(String toBeautify){
        String result = toBeautify + "ABC";
        return result;
    }

    public static String toUpperCase(String toBeautify){
        String resultToUpperCase = toBeautify.toUpperCase();
        return resultToUpperCase;
    }

    public static String toLowerCase(String toBeautify){
        String resultToLowerCase = toBeautify.toLowerCase();
        return resultToLowerCase;
    }
}
