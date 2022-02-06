package com.softserve.edu.hw6;

// Написати клас Person з полями name та age.
// Написати клас нащадка Developer з полем direction.
// Класи повинні мати конструктор з ініціалізацією полів, геттери, сеттери, методи equals, hashCode та toString.
// Методи equals, hashCode та toString з класу Developer повинні враховувати результати аналогічних методів батьківського класу Person.
// Створити масив із 5-8 об'єктів типу Developer (можна захардкодити).
// Вивести на екран наймолодших Java девелоперів.

import java.util.*;

public class App {
    public static void main(String[] args) {
        App.printTheYoungestDevelopers(
            App.createDevelopersList()
        );
    }

    private static Developer[] createDevelopersList() {
        Developer[] developersList = {
                new Developer("Olenka", 24, "Java"),
                new Developer("Yaroslav", 26, "JavaScript"),
                new Developer("Julia", 30, "Java"),
                new Developer("Ira", 25, "Java"),
                new Developer("Petro", 27, "Java"),
                new Developer("Ihor", 18, "Python"),
                new Developer("Maksym", 35, "C#"),
                new Developer("Natalia", 38, "C++")
        };

        return developersList;
    }

    private static void printTheYoungestDevelopers(Developer[] developers){
        String language = "Java";
        int numbersOfYoungestDevelopers = 2;

        ArrayList<Developer> javaDevelopers = App.filterDevelopersByLanguage(developers, language);

        javaDevelopers.sort(Comparator.comparing(Developer::getAge));

        App.printDevelopersByNumber(javaDevelopers, numbersOfYoungestDevelopers);
    }

    private static ArrayList<Developer> filterDevelopersByLanguage (Developer[] developers, String language){
        ArrayList<Developer> javaDevelopers = new ArrayList<>();

        for (Developer developer : developers) {
            if (Objects.equals(developer.getDirection(), language)) {
                javaDevelopers.add(developer);
            }
        }
        return javaDevelopers;
    }

    private static void printDevelopersByNumber (ArrayList<Developer> developers, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(developers.get(i));
        }
    }
}
