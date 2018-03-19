package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){

        List<Integer> evenNumbers = new ArrayList<Integer>();

        for (Integer eNumbers : numbers){
            if(eNumbers % 2 == 0) {
                evenNumbers.add(eNumbers);
            }
        }

        return evenNumbers;
    }
}
