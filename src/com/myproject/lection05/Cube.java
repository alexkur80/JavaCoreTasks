package com.myproject.lection05;

/**
 * Explores inner class in outer Cube
 */
public class Cube implements IShape {
    private static double length;

    Cube(double length) {
        Cube.length = length;
    }

    /**
     * Calculates Cube's diagonal length
     *
     * @return Cube's diagonal length
     */
    public double cubeDiagonal() {
        double diagonal;
        diagonal = Math.sqrt(3) * length;
        return diagonal;
    }

    /**
     * Calculates square of Cube
     *
     * @return Cube's square
     */
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

        /**
         * Calculates square of Square, inner class, outer is Cube
         *
         * @return Square's square
         */
        @Override
        public double area() {
            return Math.pow(length, 2);
        }
    }
}