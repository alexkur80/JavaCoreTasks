/**
 * This class define TriangleRight implemented from interface IShape so it should be Overriding
 * methods: public double area(), public String toString().
 *
 * @param public double area() - Overriding method calculate area of TriangleRight and return area, type double
 * @param public String toString() - Overriding method informing you are inside TriangleRight class.
 * @author Kurlovich Alexander
 * @version Lection08 Polymorphism
 */

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
