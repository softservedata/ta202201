package com.softserve.edu.hw8;

public class Swallow extends FlyingBird{

    public Swallow(String name) {
        super(name);
    }

    @Override
    public int compareTo(Bird birds) {
        return this.getName().compareTo(birds.getName());
    }
}
