package com.myproject.lection05;

/**
 * Explores inner class in outer Oval
 */
public class Oval implements IShape {
    private static double radiusA;
    private static double radiusB;


    Oval(double radiusA, double radiusB) {
        Oval.radiusA = radiusA;
        Oval.radiusB = radiusB;
    }

    /**
     * Calculates square of Oval
     *
     * @return Oval's square
     */
    @Override
    public double area() {
        double area = ((radiusA + radiusB) / 2) * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Inside class Oval";
    }

    /**
     * Calculates sum Oval's radiusA and radiusB
     *
     * @return Oval's radiusA and radiusB
     */
    public double sumRadiusAB() {
        double sumRadiusAB;
        sumRadiusAB = radiusA + radiusB;
        return sumRadiusAB;
    }


    class Circle implements IShape {

        /**
         * Calculates square of Circle, inner class, outer is Oval
         *
         * @return Circle's square
         */
        @Override
        public double area() {
            double area = Math.PI * Math.pow(Oval.radiusA, 2);
            return area;
        }

        @Override
        public String toString() {
            return "Inside inner class Circle, outer is Oval";
        }
    }
}