package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: Begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: End");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: Begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: End");
    }

    @Test
    public void testOddNumbersExterminatorEmptylist(){
        //Given
        OddNumbersExterminator numbers = new OddNumbersExterminator();
        //When
        List<Integer> evenNumbers = new ArrayList<Integer>();
        List<Integer> result = numbers.exterminate(evenNumbers);
        System.out.println("Testing: " + result);
        //Then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
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
        //When
        OddNumbersExterminator numbers = new OddNumbersExterminator();
        List<Integer> result = numbers.exterminate(list);
        List<Integer> testList = new ArrayList<Integer>();
        System.out.println("Testing: " + result);

        testList.add(0);
        testList.add(2);
        testList.add(4);
        testList.add(6);
        testList.add(8);
        testList.add(10);
        testList.add(12);
        //Then
        Assert.assertEquals(testList, result);
    }
}
