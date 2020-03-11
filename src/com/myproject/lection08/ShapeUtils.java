package com.myproject.lection08;

public class ShapeUtils {

    static void isShapeIsTriangle(IShape shape) {
        ApplicationLogger.LOGGER.info("This figure is TriangleRight: " + (shape instanceof TriangleRight));
    }

    static void isShapeIsRectangle(IShape shape) {
        ApplicationLogger.LOGGER.info("This figure is Rectangle:" + (shape instanceof Rectangle));
    }

    static void isShapeIsCube(IShape shape) {
        ApplicationLogger.LOGGER.info("This figure is Cube:" + (shape instanceof Cube));
    }

    static void isShapeIsOval(IShape shape) {
        ApplicationLogger.LOGGER.info("This figure is Oval:" + (shape instanceof Oval));
    }

    static void isShapeIsCircle(IShape shape) {
        ApplicationLogger.LOGGER.info("This figure is Circle:" + (shape instanceof Oval.Circle));
    }
}

