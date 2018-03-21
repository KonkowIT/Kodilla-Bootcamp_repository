package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    double pi = 3.14;
    double radius;
    String nameC;
    static String circle = "Circle";

    public Circle(double radius) {
        this.radius = radius;
        this.nameC = circle;
    }

    public double getRadius() {
        return radius;
    }

    public static String getCircle() {
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

    public double areaCircle = pi * (radius * radius);

    @Override
    public String getShapeName() {
        return getCircle();
    }

    @Override
    public Double getField(double area) {
        return areaCircle;
    }
}
