package com.softserve.edu.hw7;

public class Rectangle extends  Figure {
    private final double a;
    private final double b;
    public Rectangle (double a, double b) {
        super("Rectangle");
        this.a=a;
        this.b=b;
    }
    public double getPerimeter() {
        return 2*(a+b);
    }
}
