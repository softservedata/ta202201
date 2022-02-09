package com.softserve.edu07abs;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
        System.out.println("public Rectangle(double width, double height) done");
    }

    public double getArea() {
        return width * height;
    }
}
