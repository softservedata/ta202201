package com.softserve.edu.hw8;

public abstract class NonFlyingBird implements Bird {

    String name;

    public NonFlyingBird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "\n name: " + getName() +
                ", could fly : " + isFly();
    }

    public boolean isFly() {
        return false;
    }
}
