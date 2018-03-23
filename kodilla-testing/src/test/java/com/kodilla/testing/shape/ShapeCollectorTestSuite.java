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
        System.out.println("Test Suite: Begin testing");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: End testing");
    }

    @Test
    public void testAddFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(19);
        //when
        shapeCollector.addFigure(circle);
        //then
        Assert.assertEquals(1, shapeCollector.getSize());
    }

    @Test
    public void testRemoveFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(19);
        shapeCollector.addFigure(circle);
        //when
        shapeCollector.removeFigure(circle);
        //then
        Assert.assertEquals(0, shapeCollector.getSize());
    }

    @Test
    public void testGetFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(10);
        shapeCollector.addFigure(square);
        //when
        Shape result = shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(100.0, result.getField(),0.1);
    }

    @Test
    public void testShowFigures(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10, 15);
        shapeCollector.addFigure(triangle);
        String resultName = "Triangle";
        //when
        String result = shapeCollector.showFigures();
        //then
        Assert.assertEquals(resultName, result);
    }
}
