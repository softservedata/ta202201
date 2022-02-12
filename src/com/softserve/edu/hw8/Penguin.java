package com.softserve.edu.hw8;

public class Penguin extends NotFlyingBird{

    private String name;

    public Penguin(String name){
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
        return '\n' + "Penguin " +
                "name= " + getName() + "; fly? " + isFly();
    }
}
