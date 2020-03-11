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



    /*  Есть ли смысл делать этот внутренний класс по логике? В этом классе можно записать методы, которые
        относятся только к кубу - например, диагонать куба. Больше не будет использоваться нигде.
        Или такое можо зщаписать в виде методов?

    */
/*    class CubeCalculation {

        public double cubeDiagonal() {
            double diagonal;
            diagonal = Math.sqrt(3) * lenght;
            return diagonal;
        }
    }*/
}




