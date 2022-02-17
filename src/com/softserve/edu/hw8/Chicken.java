package com.softserve.edu.hw8;

public class Chicken extends NonFlyingBird{
    String name;

    public Chicken(String kuritza) {
        super();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Chicken{}";
    }

    @Override
    public int compareTo(Bird o) {
        return 0;
    }
}
