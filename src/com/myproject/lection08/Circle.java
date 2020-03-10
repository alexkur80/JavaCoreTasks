/**
 * Outer class Circle
 * Inner class CircleCalculation has methods:
 * public double circleLenght()  - calculate length of circle
 */

package com.myproject.lection08;

public class Circle implements IShape {
    private double rasius;


    Circle(double radius) {
        this.rasius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * (rasius * rasius);
        return area;
    }


    class CircleCalculation {

        public double circleLenght() {
            double circleLen;
            circleLen = 2 * Math.PI * rasius;
            return circleLen;
        }
    }
}
