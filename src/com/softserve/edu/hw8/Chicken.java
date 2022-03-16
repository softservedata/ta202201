package com.softserve.edu.hw8;

public class Chicken extends NonFlyingBird{
    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bird b) {
        return name.compareTo(b.getName());
    }
}
