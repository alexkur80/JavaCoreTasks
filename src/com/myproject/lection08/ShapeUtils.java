package com.myproject.lection08;

import org.apache.log4j.Logger;

/**
 * Defines what is object one instanceof object second
 * Output information inside override toString method
 */
public class ShapeUtils {
    private static Logger LOGGER = Logger.getLogger(ShapeUtils.class);

    static void isShapeIsTriangle(IShape shape) {
        LOGGER.info("This figure is TriangleRight: " + (shape instanceof TriangleRight));
    }

    static void isShapeIsRectangle(IShape shape) {
        LOGGER.info("This figure is Rectangle:" + (shape instanceof Rectangle));
    }

    static void isShapeIsCube(IShape shape) {
        LOGGER.info("This figure is Cube:" + (shape instanceof Cube));
    }

    static void isShapeIsOval(IShape shape) {
        LOGGER.info("This figure is Oval:" + (shape instanceof Oval));
    }

    static void isShapeIsCircle(IShape shape) {
        LOGGER.info("This figure is Circle:" + (shape instanceof Oval.Circle));
    }

    static void isShapeIsSquare(IShape shape) {
        LOGGER.info("This figure is Square:" + (shape instanceof Cube.Square));
    }
}