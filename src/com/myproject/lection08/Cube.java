/**
 * This class has Outer class (Cube) and Inner class (Square) that both implemented from interface IShape.
 * So some methods must be Overriding.
 *
 * @param public double area() - Overriding method calculate area of Cube(Square) and return area, type double
 * @param public String toString() - Overriding method informing you are inside Cube(Square) class.
 *
 * <p>
 * Inner class Circle implements IShape so  area() and toString() methods should be also
 * Overriding.
 * Inner class Circle has own Constructor with NO arguments. This method uses Outer class parameter
 * radiusA.
 * @author Kurlovich Alexander
 * @version Lection08 Polymorphism
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




