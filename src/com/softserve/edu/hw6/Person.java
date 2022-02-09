package com.softserve.edu.hw6;

import java.util.Objects;

 class Person {

    private String name;
    private int age;

     public Person() {
         this.name = "";
         this.age = 0;
     }

     public Person(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

class Developer extends Person{
    private String direction;

    public Developer(String direction) {
        this.direction = "";
    }

    public Developer(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }

    public Developer() {
        this.direction = "";
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public static Developer youngestDev(String direction, Developer[] developers){
        int youngestDevId = 0;
        int minAge = 0;

        for (int i = 0; i < developers.length - 1; i++){
            if (developers[i].getDirection().equals(direction)) {
                if (minAge == 0) {
                    minAge = developers[i].getAge();
                }
                if (minAge > developers[i].getAge()) {
                    minAge = developers[i].getAge();
                    youngestDevId = i;
                    }
                }
            }
        return developers[youngestDevId];
    }

 }

class Program {
    public static void main(String[] args) {

        String direction = "Java";
        Developer youngestDirectionDev = new Developer();
        Developer[] developers = new Developer[5];
        developers[0] = new Developer("Pavlo", 35, "Java");
        developers[1] = new Developer("Dmytro", 50, "PHP");
        developers[2] = new Developer("Olha", 28, "Java");
        developers[3] = new Developer("Maria", 42, "Java");
        developers[4] = new Developer("Vasyl", 25, "Ruby");


        System.out.println("The youngest " + direction + " developer:\n" + youngestDirectionDev.youngestDev("Java", developers));
        }

    }
