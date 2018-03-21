package com.kodilla.testing.shape;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

//implementowany przez wszystkie figury

public interface Shape {

    public String getShapeName();
    public Double getField(double area);
}
