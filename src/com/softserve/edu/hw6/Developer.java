package com.softserve.edu.hw6;

import java.util.Arrays;
import java.util.Objects;

public class Developer extends Person {
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Developer(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }


    @Override
    public String toString() {
        return super.toString() + " direction= " + direction;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(direction, developer.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), direction);
    }

    public static void main(String[] args) {
        Developer[] developers = {new Developer("Andy", 32, "frontend"), new Developer("Lucy", 31, "frontend"),
                new Developer("Mark", 33, "backend"), new Developer("Tom", 34, "backend"),
                new Developer("Uli", 35, "full stack"), new Developer("Ann", 34, "frontend")};
        System.out.println(Arrays.toString(developers));
        for (int i = 0; i < developers.length - 1; i++) {
            for (int j = 0; j < developers.length - 1 - i; j++) {
                if (developers[j].getAge() > developers[j+1].getAge()) {
                    Developer temporary = developers[j];
                    developers[j] = developers[j+1];
                    developers[j+1] = temporary;
                }
            }
        }
        System.out.println(Arrays.toString(developers));
    }
}