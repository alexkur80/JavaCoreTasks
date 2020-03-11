/**
 * This class define Rectangle implemented from interface IShape so it should be Overriding
 * methods: public double area(), public String toString().
 *
 * @param public double area() - Overriding method calculate area of Rectangle and return area, type double
 * @param public String toString() - Overriding method informing you are inside Rectangle class.
 * @author Kurlovich Alexander
 * @version Lection08 Polymorphism
 */

package com.myproject.lection08;

public class Rectangle implements IShape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

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
