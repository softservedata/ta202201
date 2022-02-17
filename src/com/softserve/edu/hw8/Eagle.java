package com.softserve.edu.hw8;

public class Eagle extends FlyingBird {

    public Eagle(String name) {
        super(name);
    }

    @Override

    public int compareTo(Bird birds) {
        return this.getName().compareTo(birds.getName());
    }
}
