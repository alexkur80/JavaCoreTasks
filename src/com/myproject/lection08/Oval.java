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

    class OvalCalculation {

        public double sumRadiusAandB() {
            double sumRadiusAandB;
            sumRadiusAandB = radiusA + radiusB;
            return sumRadiusAandB;
        }
    }


}
