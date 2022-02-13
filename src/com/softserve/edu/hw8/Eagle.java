package com.softserve.edu.hw8;

public class Eagle extends FlyingBird {
    private final String name;

    public Eagle(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Eagle name: " + this.getName() + ", Can fly? " + this.isFly();
    }

    @Override
    public int compareTo(IBird bird) {
        return this.getName().compareTo(bird.getName());
    }
}
