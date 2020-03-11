/**
 * This class has Outer class and Inner class that both implemented from interface IShape so somce
 * methods should be Overriding.
 *
 * @param public double area() - Overriding method calculate area of Rectangle and return area, type double
 * @param public String toString() - Overriding method informing you are inside Rectangle class.
 * @param public double sumRadiusAandB() - method calculate sum of RadiosA+ RadiusB
 * <p>
 * Inner class Circle implements IShape so  area() and toString() methods should be also
 * Overriding.
 * Inner class Circle has own Constructor with NO arguments. This method used Outer class parameter
 * radiusA.
 * @author Kurlovich Alexander
 * @version Lection08 Polymorphism
 */


package com.myproject.lection08;

public class Oval implements IShape {
    double radiusA;
    double radiusB;


    Oval(double radiusA, double radiusB) {
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    @Override
    public double area() {
        double area = ((radiusA + radiusB) / 2) * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Inside class Oval";
    }

    public double sumRadiusAandB() {
        double sumRadiusAandB;
        sumRadiusAandB = radiusA + radiusB;
        return sumRadiusAandB;
    }


    class Circle implements IShape {

        @Override
        public double area() {
            double area = Math.PI * Math.pow(Oval.this.radiusA, 2);
            return area;
        }

        @Override
        public String toString() {
            return "Inside inner class Circle, outer is Oval";
        }
    }
}

