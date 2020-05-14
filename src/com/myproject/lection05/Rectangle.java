package com.myproject.lection05;

/**
 * Defines Rectangle implemented from IShape, has overriding
 * methods: public double area(), public String toString().
 */
public class Rectangle implements IShape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates square of Rectangle
     *
     * @return Rectangle's square
     */
    @Override
    public double area() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "Inside class Rectangle";
    }
}