package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

//klasa, którą mam przetestować
//przechowuje figury geometrzycnze w kolekcji ArrayList

public class ShapeCollector {

    private List<Shape> shapesList = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public int getSize(){
        return shapesList.size();
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n > -1 && n < shapesList.size()) {
            return shapesList.get(n);
        }
        return null;
    }

    public String showFigures() {
        String result = "";

        for (Shape nameResult : shapesList) {
            result = result + nameResult.getShapeName();
        }
        return result;
    }
}

