package com.softserve.edu.hw8;

public class Eagle extends FlyingBird {
    String name;

    public Eagle(String name) {
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
                "isFly()='" + isFly() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Bird bird) {
        return getName().compareTo(bird.getName());
    }
}
