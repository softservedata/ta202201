package com.softserve.edu.hw6;

import java.util.Objects;

public class Developer extends Person{

    String direction;

    public Developer(){

    }

    public Developer(String name, int age, String devDirection){
        super(name, age);
        this.direction = devDirection;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        //if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(direction, developer.direction);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(direction);
    }

    @Override
    public String toString() {
        return super.toString() + " direction= " + direction;
    }
}