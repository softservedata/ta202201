package com.softserve.edu.hw7;

public abstract class Figure {
    private final String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();

    public String getName() {
        return name;
    }
}
