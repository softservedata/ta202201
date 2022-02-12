package com.softserve.edu.hw8;

public class Chicken extends NotFlyingBird{

    private String name;

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Bird bird) {
        return name.compareTo(bird.getName());
    }

    @Override
    public String toString() {
        return '\n' + "Chicken " +
                "name= " + getName() + "; fly? " + isFly();
    }
}
