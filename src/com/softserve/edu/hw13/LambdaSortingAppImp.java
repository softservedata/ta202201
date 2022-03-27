package com.softserve.edu.hw13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSortingAppImp implements LambdaSortingApp {
    public void printSortedPeople() {
        List<String> peopleName = this.createPeopleList();
        this.printConsole("People names: ", peopleName);

        this.sortByName(peopleName);
        this.printConsole("Sorted people by name: ", peopleName);
    }


    private void sortByName(List<String> peopleName) {
        Comparator<String> operation = (String firstName, String secondName) -> {
            Integer firstLength = firstName.length();
            Integer secondLength = secondName.length();

            if (firstLength.equals(secondLength)) {
                return firstName.compareTo(secondName);
            } else if (firstLength < secondLength) {
                return -1;
            } else {
                return 1;
            }
        };

        Collections.sort(peopleName, operation);
    }

    private void printConsole(String title, List<String> printList) {
        System.out.println(title + printList);
    }

    private List<String> createPeopleList() {
        List<String> peopleName = Arrays.asList("Olenka", "Irynka", "Yarik", "Petro", "Ola", "Mi", "Ula");
        return peopleName;
    }
}
