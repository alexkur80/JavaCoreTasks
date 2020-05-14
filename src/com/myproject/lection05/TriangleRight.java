package com.myproject.lection05;

/**
 * Defines TriangleRight implemented from IShape, having overriding
 * methods: public double area(), public String toString().
 */
public class TriangleRight implements IShape {
    private double sideA;
    private double sideB;

    TriangleRight(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * Calculates square of Triangle Right
     *
     * @return area of TriangleRight
     */
    @Override
    public double area() {
        return (sideA * sideB) / 2;
    }

    @Override
    public String toString() {
        return "Inside class TriangleRight";
    }
}