package com.softserve.edu.hw6;

import java.util.Objects;

public class Developer extends Person{
    private String direction;

    public Developer(String name, int age, String direction) {
        super(name, age); //use parent constructor
        this.direction = direction;
    }

    public String getDirection(){
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        String parentStringProperties = super.toString();
        return parentStringProperties + ", Direction: " + this.getDirection();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)){
            return false;
        }

        if (getClass() != o.getClass()) return false;

        //o is converting to type = Developer
        Developer developerToCompare = (Developer) o;

        return this.hashCode() == developerToCompare.hashCode();
    }

    //to compare objects hash instead of objects properties
    @Override
    public int hashCode() {
        int parentHashCode = super.hashCode();
        return Objects.hash(parentHashCode, direction);
    }
}
