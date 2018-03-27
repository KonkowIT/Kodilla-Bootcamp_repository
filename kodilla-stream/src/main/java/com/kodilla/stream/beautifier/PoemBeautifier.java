package com.kodilla.stream.beautifier;

import com.kodilla.stream.StreamMain;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class PoemBeautifier {

    public void beautify(String toBeautify, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(toBeautify);
        System.out.println("Result - " + result);
    }
}
