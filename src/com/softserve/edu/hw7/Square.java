package com.softserve.edu.hw7;

public class Square extends Figure{
    protected int edge;

    public Square(int edge) {
        super("Square");
        this.edge = edge;
    }

    @Override
    public String toString() {
        return super.toString() +
                "edge=" + edge +
                '}';
    }

    public int getPerimeter() {return 2 * edge;}
}

