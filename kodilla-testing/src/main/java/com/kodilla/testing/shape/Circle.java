package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    double radius;
    static String circle = "Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getCircle() {
        return circle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle1 = (Circle) o;
        return Double.compare(circle1.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String getShapeName(String circle) {
        return getCircle();
    }

}
