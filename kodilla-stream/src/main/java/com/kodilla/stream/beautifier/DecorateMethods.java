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
        String result = toUpperCase(toBeautify);
        return result;
    }

    public static String toLowerCase(String toBeautify){
        String result = toLowerCase(toBeautify);
        return result;
    }
}
