package com.myproject.lection08;


import com.myproject.utils.ApplicationLogger;


public class GeometricFig {
    public static void main(String[] args) {
        double widthRectangle = 10;
        double heightRectangle = 20;

        double radiusCircle = 10;

        double radiusAOval = 15;
        double radiusBOval = 20;

        double cubeLenght = 15;

        double rectangleAreaResult;
        double circleAreaResult;
        double ovalAreaResult;
        double cubeAreaResult;
        double cubeDiagonalResult;
        double circleLenghtResult;
        double ovalSumRadiusAandB;

        IShape shape;


        IShape rectangle = new Rectangle(widthRectangle, heightRectangle);
        shape = rectangle;
        rectangleAreaResult = shape.area();


        IShape circle = new Circle(radiusCircle);
        shape = circle;
        circleAreaResult = shape.area();

// приведение к типу CIRCLE, тк интерфейс не имеет этого метода
        Circle.CircleCalculation circleCalculation = ((Circle) shape).new CircleCalculation();
        circleLenghtResult = circleCalculation.circleLenght();

/*      Если создать ссылку типа CIRCLE, то для доступа к методу использовать такой вызов
        Circle circle2 = new Circle(radiusCircle);
        circleLen = circle2.circleLen();   // приведение к типу CIRCLE, тк интерфейс не имеет этого метода

*/
        IShape oval = new Oval(radiusAOval, radiusBOval);
        shape = oval;
        ovalAreaResult = shape.area();
        Oval.OvalCalculation ovalCalculation = ((Oval) shape).new OvalCalculation();
        ovalSumRadiusAandB = ovalCalculation.sumRadiusAandB();

        IShape cube = new Cube(cubeLenght);
        shape = cube;

// привести к типу Cube, тк  имплементируемый интерфейс не имеет этого метода
        Cube.CubeCalculation cubeCalculation = ((Cube) shape).new CubeCalculation();
        cubeDiagonalResult = cubeCalculation.cubeDiagonal();
        cubeAreaResult = shape.area();

        ApplicationLogger.LOGGER.info("Rectangle area: " + rectangleAreaResult);
        ApplicationLogger.LOGGER.info("Circle area: " + circleAreaResult);
        ApplicationLogger.LOGGER.info("Circle lenght: " + circleLenghtResult);
        ApplicationLogger.LOGGER.info("Cube area: " + cubeAreaResult);
        ApplicationLogger.LOGGER.info("Cube diagonal: " + cubeDiagonalResult);
        ApplicationLogger.LOGGER.info("Oval area: " + ovalAreaResult);
        ApplicationLogger.LOGGER.info("Oval sum Radius A and Radius B: " + ovalSumRadiusAandB);
    }
}
