package com.myproject.lection08;

public class TriangleRight implements IShape {
    double sideA;
    double sideB;

    TriangleRight(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        double area = (sideA * sideB) / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Inside class TriangleRight";
    }

}
