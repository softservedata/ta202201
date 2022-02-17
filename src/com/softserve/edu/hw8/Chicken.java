package com.softserve.edu.hw8;

public class Chicken extends NonFlyingBird{

    public Chicken(String name) {
        super(name);
    }

    @Override
    public int compareTo(Bird birds) {
        return this.getName().compareTo(birds.getName());
    }
}
