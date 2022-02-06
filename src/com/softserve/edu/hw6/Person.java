package com.softserve.edu.hw6;

import java.util.Objects;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name: " + this.getName() +
                ", Age: " + this.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return false;

        //o is converting to type = Person
        Person personToCompare = (Person) o;

        return this.hashCode() == personToCompare.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }
}
