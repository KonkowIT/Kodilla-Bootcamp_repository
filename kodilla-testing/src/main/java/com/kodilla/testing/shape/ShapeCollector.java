package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

//klasa, którą mam przetestować
//przechowuje figury geometrzycnze w kolekcji ArrayList

public class ShapeCollector {

    double pi = 3.14;

    List<Shape> listOfShapes = new ArrayList<Shape>();

    public Circle addShape (double radius, double height, double longestSide, double side) {
        Circle theCircle = new Circle(radius);
        Triangle theTriangle = new Triangle(height, longestSide);
        Square theSquare = new Square(side);

        if(radius != 0 && height == 0 && longestSide == 0 && side == 0){
            listOfShapes.add(theCircle);
        }
        else{}

        if(radius == 0 && height != 0 && longestSide != 0 && side == 0) {
            listOfShapes.add(theTriangle);
        }
        else{}

        if(radius == 0 && height == 0 && longestSide == 0 && side != 0) {
            listOfShapes.add(theSquare);
        }
        else{}

        return (theCircle, theTriangle, theSquare);
    }

    private List<Shape> shapesList = new ArrayList<Shape>();

    public double getField(double radius, double height, double longestSide, double side){
        if(radius != 0 && height == 0 && longestSide == 0 && side == 0){
            double areaSquare = side * side;
            return areaSquare;
        }
        else{}

        if(radius == 0 && height != 0 && longestSide != 0 && side == 0) {
            double areaTriangle = 0.5 * (longestSide * height);
            return areaTriangle;
        }
        else{}

        if(radius == 0 && height == 0 && longestSide == 0 && side != 0) {
            double areaCircle = pi * (radius * radius);
            return areaCircle;
        }
        else{}
    }

    public void addFigure(Shape shape){

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
            shapeNames.getShapeName(n);
        }
        return shapesList.get(n);
    }

    public void showFigures(Shape shape){
        return shapesList.get(shape.getShapeName(Circle.getCircle(), shape.getShapeName(Square.getSquare()), shape.getShapeName(Triangle.getTriangle()));
    }
}
