package com.softserve.edu.hw8;

public class Swallow extends FlyingBird{
    private String name;

    public Swallow(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " name= " + getName() +
                " isFly= " + isFly();
    }

    @Override
    public int compareTo(Bird bird) {
        return name.compareTo(bird.getName());
    }
}
