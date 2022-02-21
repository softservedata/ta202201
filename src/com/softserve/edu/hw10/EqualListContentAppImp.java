package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EqualListContentAppImp implements EqualListContentApp {
    public void printCheckEqualContent() {
        ArrayList<Integer> firstArrayList = this.generateListNumbers(5);
        ArrayList<Integer> secondArrayList = this.generateListNumbers(10);

        this.printConsole("First List: ", firstArrayList);
        this.printConsole("Second List: ", secondArrayList);

        HashSet<Integer> firstSet = this.convertListToHashSet(firstArrayList);
        HashSet<Integer> secondSet = this.convertListToHashSet(secondArrayList);

        boolean result = this.isHashSetEqual(firstSet, secondSet);
        this.printConsole("Are these lists equal? - ", result);
    }

    private boolean isHashSetEqual(HashSet<Integer> first, HashSet<Integer> second) {
        return first.equals(second);
    }

    private HashSet<Integer> convertListToHashSet(ArrayList<Integer> list) {
        return new HashSet<>(list);
    }

    private void printConsole(String title, List<Integer> printList) {
        System.out.println(title + printList);
    }

    private void printConsole(String title, boolean printResult) {
        System.out.println(title + printResult);
    }

    private ArrayList<Integer> generateListNumbers(int n) {
        ArrayList<Integer> generatedList = new ArrayList<>();
        int min = -1;
        int max = 3;

        for (int i = 0; i < n; i++) {
            generatedList.add(this.generateRandomNumber(min, max));
        }

        return generatedList;
    }

    private int generateRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }
}
