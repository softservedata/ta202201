package com.softserve.edu07abs;

public abstract class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
        System.out.println("public Figure(String name) done");
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
}
