package com.softserve.edu.hw8;

public class Chicken extends NonFlyingBird {
    private final String name;

    public Chicken(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Chicken name: " + this.getName() + ", Can fly? " + this.isFly();
    }

    @Override
    public int compareTo(IBird bird) {
        return this.getName().compareTo(bird.getName());
    }
}
