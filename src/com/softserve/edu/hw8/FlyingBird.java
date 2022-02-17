package com.softserve.edu.hw8;

abstract class FlyingBird implements Bird {

    String name;

    public FlyingBird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String toString() {
        return  "\n name: " + getName() +
                ", could fly : " + isFly();
    }

    @Override
    public boolean isFly() {
        return true;
    }
}
