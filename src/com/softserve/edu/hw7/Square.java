package com.softserve.edu.hw7;

public class Square extends Figure{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getPerimeter() {
        return a * 4;
    }
}
