package com.softserve.edu.hw8;

public class Eagle extends FlyingBird{

    private String name;

    public Eagle(String name){
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
        return " name= " + getName() +
        " isFly= " + isFly();
    }
}
