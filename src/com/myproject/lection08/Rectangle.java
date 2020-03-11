package com.myproject.lection08;

public class Rectangle implements IShape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString(){
        return "Inside class Rectangle";
    }

}
