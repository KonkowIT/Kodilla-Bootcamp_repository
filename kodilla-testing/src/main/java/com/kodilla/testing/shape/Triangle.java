package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private double height;
    private double longestSide;
    private String triangle = "Triangle";

    public Triangle(double height, double longestSide) {
        this.height = height;
        this.longestSide = longestSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle1 = (Triangle) o;
        return Double.compare(triangle1.height, height) == 0 &&
                Double.compare(triangle1.longestSide, longestSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, longestSide);
    }

    @Override
    public String getShapeName() {
        return triangle;
    }

    @Override
    public double getField() {
        return 0.5 * (height * longestSide);
    }

}
