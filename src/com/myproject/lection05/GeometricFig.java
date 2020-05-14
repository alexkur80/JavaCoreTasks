package com.myproject.lection05;

import org.apache.log4j.Logger;


public class GeometricFig {

    public final static Logger LOGGER = Logger.getLogger(GeometricFig.class);

    public static void main(String[] args) {
        IShape shape;

        double widthRectangle = 10;
        double heightRectangle = 20;
        shape = new Rectangle(widthRectangle, heightRectangle);
        LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        LOGGER.info("Rectangle area: " + shape.area() + "\n");

        double cubeLenght = 15;
        shape = new Cube(cubeLenght);
        LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        LOGGER.info("Cube area: " + shape.area());
        LOGGER.info("Cube diagonal: " + ((Cube) shape).cubeDiagonal() + "\n");

        shape = ((Cube) shape).new Square();
        LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        LOGGER.info("Square area: " + shape.area() + "\n");

        double radiusAOval = 15;
        double radiusBOval = 20;
        shape = new Oval(radiusAOval, radiusBOval);
        LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        LOGGER.info("Oval area: " + shape.area());
        LOGGER.info("Oval sum Radius A and Radius B: "
                + ((Oval) shape).sumRadiusAB() + "\n");

        shape = ((Oval) shape).new Circle();
        LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        LOGGER.info("Circle area: " + shape.area() + "\n");

        double triangleRightSideA = 10;
        double triangleRightSideB = 15;
        shape = new TriangleRight(triangleRightSideA, triangleRightSideB);
        LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        LOGGER.info("Triangle area: " + shape.area());
    }
}