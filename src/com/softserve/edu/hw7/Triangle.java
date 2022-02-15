package com.softserve.edu.hw7;

public class Triangle extends Figure {
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    int a;
    int b;
    int c;

    @Override
    public int getPerimetr() {

        return a + b + c;
    }
}
