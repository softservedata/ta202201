package com.softserve.edu.hw8;

public class Penguin extends NonFlyingBird {
    String name;

    public Penguin(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                "isFly()='" + isFly() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bird bird) {
        return getName().compareTo(bird.getName());
    }
}
