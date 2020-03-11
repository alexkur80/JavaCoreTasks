/**
 * Outer class Cube
 * Inner class CubeCalculation has methods:
 * public double diagonal()   - calculate diagonal of cube, don't used but with Cube.
 */


package com.myproject.lection08;

public class Cube implements IShape {
    private static double length;

    Cube(double lenght) {
        this.length = lenght;
    }

    public double cubeDiagonal() {
        double diagonal;
        diagonal = Math.sqrt(3) * length;
        return diagonal;
    }

    @Override
    public double area() {
        double area = 6 * (Math.pow(length, 2));
        return area;
    }

    @Override
    public String toString() {
        return "Inside class Cube";
    }


    class Square implements IShape {

        Square(double length) {
            Cube.this.length = length;
        }

        @Override
        public String toString() {
            return "Inside inner class Square, outer is Cube";
        }

        @Override
        public double area() {
            return Math.pow(length, 2);
        }
    }
}




