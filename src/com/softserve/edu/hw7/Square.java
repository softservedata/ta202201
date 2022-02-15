package com.softserve.edu.hw7;

public class Square extends Figure {
    public Square(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    int a;

    @Override
    public int getPerimetr() {

        return a * 4;
    }
}
