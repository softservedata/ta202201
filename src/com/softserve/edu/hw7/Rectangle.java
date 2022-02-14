package com.softserve.edu.hw7;

public class Rectangle extends Figure{
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getPerimeter() {return 2 * (width + height);}
}
