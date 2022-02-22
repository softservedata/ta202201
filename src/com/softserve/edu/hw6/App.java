package com.softserve.edu.hw6;
/*Homework 6 (from 04.02.2022)
        1) Написати клас Person з полями name та age.
        Написати клас нащадка Developer з полем direction.
        Класи повинні мати конструктор з ініціалізацією полів, геттери, сеттери, методи equals, hashCode та toString.
        Методи equals, hashCode та toString з класу Developer повинні враховувати результати аналогічних методів батьківського класу Person.
        Створити масив із 5-8 об'єктів типу Developer (можна захардкодити).
        Вивести на екран наймолодших Java девелоперів.*/
public class App {
    public static void main(String[] args) {
        Developer[] developers = {
                new Developer("Alex",18, "Go"),
                new Developer("Oleh",24, "Javascript"),
                new Developer("Ivan",18, "Java"),
                new Developer("Vova",21, "Java"),
                new Developer("Kiril",19, "Java"),
                new Developer("Olha",18, "Java")
        };

        int min_age = developers[0].getAge();
        for (Developer current : developers) {
            if (current.getAge() <= min_age && current.getDirection().equals("Java"))
                min_age = current.getAge();
        }
        System.out.println("Min age is " + min_age);

        for (Developer current : developers) {
            if (current.getDirection().equals("Java") && current.getAge() == min_age)
                System.out.println(current.getName() + " is " + current.getAge() + " years old");
        }
    }
}
