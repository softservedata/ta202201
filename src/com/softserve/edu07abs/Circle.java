package com.softserve.edu07abs;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        System.out.println("public Circle(double radius) done");
    }

    public double getArea() {
        return (3.14 * (radius * 2));
    }
} 