package com.softserve.edu.hw7;

public class Triangle  extends Figure{
    protected int side1;
    protected int side2;
    protected int edge;

    public Triangle(int side1, int side2, int edge) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.edge = edge;
    }

    @Override
    public String toString() {
        return super.toString() +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", edge=" + edge +
                '}';
    }

    public int getPerimeter() {return side1 + side2 + edge;}
}
