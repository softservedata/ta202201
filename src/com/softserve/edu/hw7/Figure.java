package com.softserve.edu.hw7;



public abstract class Figure {
    private String name;
    public Figure (String name) {
        this.name=name;
        System.out.println("Figure name is");
    }
    public abstract double getPerimeter ();

    public void setName (String name) {
        this.name=name;
    }
    public String getName () {
        return name;
    }

    public abstract double getPerimeter(double side);

    public abstract double getPerimeter(double a, double b);
}
