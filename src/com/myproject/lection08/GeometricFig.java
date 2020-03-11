package com.myproject.lection08;


import com.myproject.utils.ApplicationLogger;


public class GeometricFig {
    public static void main(String[] args) {
        double widthRectangle = 10;
        double heightRectangle = 20;

        double radiusAOval = 15;
        double radiusBOval = 20;

        double cubeLenght = 15;

        double triangleRightSideA = 10;
        double triangleRightSideB = 15;


        IShape shape;

        IShape rectangle = new Rectangle(widthRectangle, heightRectangle);
        shape = rectangle;
        ApplicationLogger.LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);

        ApplicationLogger.LOGGER.info("Rectangle area: " + shape.area() + "\n");


        IShape cube = new Cube(cubeLenght);
        shape = cube;
        ApplicationLogger.LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);

        ApplicationLogger.LOGGER.info("Cube area: " + shape.area());
        ApplicationLogger.LOGGER.info("Cube diagonal: " + ((Cube) shape).cubeDiagonal() + "\n");


        Cube.Square square = ((Cube) shape).new Square(cubeLenght);
        shape = square;
        ApplicationLogger.LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);

        ApplicationLogger.LOGGER.info("Square area: " + shape.area() + "\n");

        IShape oval = new Oval(radiusAOval, radiusBOval);
        shape = oval;
        ApplicationLogger.LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);

        ApplicationLogger.LOGGER.info("Oval area: " + shape.area());
        ApplicationLogger.LOGGER.info("Oval sum Radius A and Radius B: "
                + ((Oval) shape).sumRadiusAandB() + "\n");


        Oval.Circle circle = ((Oval) shape).new Circle(radiusAOval);
        shape = circle;
        ApplicationLogger.LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        ApplicationLogger.LOGGER.info("Circle area: " + shape.area() + "\n");


        IShape triangleRight = new TriangleRight(triangleRightSideA, triangleRightSideB);
        shape = triangleRight;
        ApplicationLogger.LOGGER.info(shape.toString());
        ShapeUtils.isShapeIsTriangle(shape);
        ShapeUtils.isShapeIsRectangle(shape);
        ShapeUtils.isShapeIsCube(shape);
        ShapeUtils.isShapeIsOval(shape);
        ShapeUtils.isShapeIsCircle(shape);
        ShapeUtils.isShapeIsSquare(shape);
        ApplicationLogger.LOGGER.info("Triangle area: " + shape.area());

    }
}
