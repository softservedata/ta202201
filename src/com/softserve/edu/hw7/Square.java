package com.softserve.edu.hw7;

public class Square extends Figure{

    private double d;

    public Square(String name, double d) {
        super(name);
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getPerimeter() {
        return d * 3.14;
    }
}
