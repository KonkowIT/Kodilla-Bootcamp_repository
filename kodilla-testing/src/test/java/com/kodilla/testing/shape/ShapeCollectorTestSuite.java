package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testShapeCollector(){

    }
}
