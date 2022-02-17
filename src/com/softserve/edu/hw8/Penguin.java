package com.softserve.edu.hw8;

public class Penguin extends NonFlyingBird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public int compareTo(Bird birds) {
        return this.getName().compareTo(birds.getName());
    }
}