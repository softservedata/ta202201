package com.softserve.edu.hw7;

public class Square extends Figure {
    private final double x;

    public Square(double x) {
        super("Square");
        this.x = x;
    }

    public double getPerimeter(){
        return 4 * x;
    }

}
