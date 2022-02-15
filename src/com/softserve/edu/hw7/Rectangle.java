package com.softserve.edu.hw7;

public class Rectangle extends Figure {
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    int a;
    int b;

    @Override
    public int getPerimetr() {

        return a * 2 + b * 2;
    }
}
