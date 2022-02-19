package com.softserve.edu.hw8;

public class Swallow extends FlyingBird {
    String name;

    public Swallow(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "name='" + name + '\'' +
                "isFly()='" + isFly() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bird bird) {
        return getName().compareTo(bird.getName());
    }
}
