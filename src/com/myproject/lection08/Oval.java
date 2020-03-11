/**
 * Outer class Oval
 * Inner class OvalCalculation has methods:
 * public double sumRadiusAandB()   - calculate sum of RadiosA+ RadiusB
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

        Circle(double radiusA) {
            Oval.this.radiusA = radiusA;
        }

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

