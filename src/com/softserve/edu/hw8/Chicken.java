package com.softserve.edu.hw8;

public class Chicken extends NonFlyingBird {
    String name;

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                "isFly()='" + isFly() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bird bird) {
        return getName().compareTo(bird.getName());
    }
}
