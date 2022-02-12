package com.softserve.edu.hw7;

public class Rectangle extends Figure {
    private final double x, y;

    public Rectangle(double x, double y) {
        super("Rectangle");
        this.x = x;
        this.y = y;
    }

    public double getPerimeter() {
        return 2 * (x + y);
    }
}
