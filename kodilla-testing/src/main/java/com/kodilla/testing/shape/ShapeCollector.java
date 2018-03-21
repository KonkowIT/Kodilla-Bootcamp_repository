package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;

//klasa, którą mam przetestować
//przechowuje figury geometrzycnze w kolekcji ArrayList

public class ShapeCollector {

    public Circle addCircle (double radius) {
        Circle theCircle = new Circle(radius);
        return theCircle;
    }

    public Triangle addTriangle (double height, double longestSide){
        Triangle theTriangle = new Triangle(height, longestSide);
        return theTriangle;
    }

    public Square addSquare(double side){
        Square theSquare = new Square(side);
        return theSquare;
    }

    private List<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapesList.add(addCircle(12));
        shapesList.add(addSquare(13));
        shapesList.add(addTriangle(5,11));
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapesList.contains(shape)){
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public ShapeCollector(int n){
        for(Shape shapeNames : shapesList) {
            shapeNames.getShapeName();
        }
        return shapesList.get();
    }

    public void showFigures(Shape shape){
        return shapesList.get(shape.getShapeName(Circle.getCircle()));
        return shapesList.get(shape.getShapeName(Triangle.getTriangle()));
        return shapesList.get(shape.getShapeName(Square.getSquare()));
    }
}
