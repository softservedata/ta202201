package com.softserve.edu.hw7;

public class Triangle extends Figure{
    private final double x;
    private final double y;
    private final double z;
    public Triangle(double x, double y, double z) {
        super("Triangle");
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public double getPerimeter(double x, double y, double z) {
        return x+y+z;
    }
}
