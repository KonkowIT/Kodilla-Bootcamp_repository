package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorEmptylist(){
        OddNumbersExterminator numbers = new OddNumbersExterminator();
        List<Integer> evenNumbers = new ArrayList<Integer>();

        List<Integer> result = numbers.exterminate(evenNumbers);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        List<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        OddNumbersExterminator numbers = new OddNumbersExterminator();
        List<Integer>result = numbers.exterminate(list);
        List<Integer> testList = new ArrayList<Integer>();

        testList.add(0);
        testList.add(2);
        testList.add(4);
        testList.add(6);
        testList.add(8);
        testList.add(10);
        testList.add(12);

        Assert.assertEquals(testList, result);
    }
}
