package com.softserve.edu.hw6;

import java.util.*;

public class App {
    public static void main(String[] args) {
        App.printTheYoungestDevelopers(
                App.createDevelopersList()
        );
    }

    private static Developer[] createDevelopersList() {
        Developer[] developersList = {
                new Developer("Mihail", 20, "Swift"),
                new Developer("Nikolay", 26, "Python"),
                new Developer("Julia", 30, "Java"),
                new Developer("Grisha", 29, "Java"),
                new Developer("Petro", 26, "Ruby"),
                new Developer("Nadya", 18, "Java"),
                new Developer("Maksym", 19, "Typescript"),
                new Developer("Natalia", 43, "Ruby")
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
