package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private double side;
    private static String square = "Square";

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public String getSquare() {
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square1 = (Square) o;
        return Double.compare(square1.side, side) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(side);
    }

    public double areaSquare = side * side;

    @Override
    public String getShapeName(String circle) {
        return getSquare();
    }
}
