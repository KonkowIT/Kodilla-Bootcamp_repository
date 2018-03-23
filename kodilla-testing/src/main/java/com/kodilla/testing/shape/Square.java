package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private double side;
    private String square = "Square";

    public Square(double side) {
        this.side = side;
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

    @Override
    public String getShapeName() {
        return square;
    }

    @Override
    public double getField() {
        return side * side;
    }
}
