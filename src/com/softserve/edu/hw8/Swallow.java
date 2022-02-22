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
    public int compareTo(Bird bird) {
        return name.compareTo(bird.getName());
    }

    @Override
    public String toString() {
        return '\n' + "Swallow " +
                "name= " + getName() + "; fly? " + isFly();
    }
}