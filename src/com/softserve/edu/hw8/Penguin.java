package com.softserve.edu.hw8;

public class Penguin extends NonFlyingBird {
    String name;

    public Penguin(String pengvin) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Penguin{}";
    }

    @Override
    public int compareTo(Bird o) {
        return 0;
    }
}
