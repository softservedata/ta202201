package com.softserve.edu.hw6;

import java.util.Objects;

public class Developer {
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Developer(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(direction, developer.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
