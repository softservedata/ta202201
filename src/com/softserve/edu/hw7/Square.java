package com.softserve.edu.hw7;

public class Square extends Figure {
    private double side1;

    public Square(double side1) {
        this.side1 = side1;
    }

    @Override
    public double getPerimeter() {
        return ((side1 * 4));
    }
}
