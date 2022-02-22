package com.softserve.edu.hw6;

import java.util.Objects;

public class Developer extends Person {
    private String direction;

    public Developer(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer)) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return getDirection().equals(developer.getDirection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDirection());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "direction='" + direction + '\'' +
                "} " + super.toString();
    }

}
