package com.softserve.edu.hw7;

public class Square extends Figure{

    public double a;

    public Square(double a){
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}