package com.softserve.edu.hw8;

public class Swallow extends FlyingBird {
    private final String name;

    public Swallow(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Swallow name: " + this.getName() + ", Can fly? " + this.isFly();
    }

    @Override
    public int compareTo(IBird bird) {
        return this.getName().compareTo(bird.getName());
    }
}
