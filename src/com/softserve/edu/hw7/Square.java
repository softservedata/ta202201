package com.softserve.edu.hw7;

public class Square extends Figure {
    private final double side;
    public Square (double side) {
        super("Square");
        this.side=side;
    }
    //public double getSide () {return side;}

    public double getPerimeter() {
        return side*4;
    }
}
