package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{

    private double height;
    private double longestSide;
    private static String triangle = "Triangle";

    public Triangle(double height, double longestSide) {
        this.height = height;
        this.longestSide = longestSide;
    }

    public double getHeight() {
        return height;
    }

    public double getLongestSide() {
        return longestSide;
    }

    public String getTriangle() {
        return triangle;
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

}
