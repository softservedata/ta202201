package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;

public class IntersectionAppImp implements IntersectionApp {
    public void printGeneratedIntersectionList() {
        ArrayList<Integer> firstArrayList = this.generateListNumbers(10);
        ArrayList<Integer> secondArrayList = this.generateListNumbers(15);

        List<Integer> finalList = this.getListIntersection(
            firstArrayList,
            secondArrayList
        );

        this.printList("First List: ", firstArrayList);
        this.printList("Second List: ", secondArrayList);
        this.printList("Final List: ", finalList);
    }

    private void printList(String listName, List<Integer> printList) {
        System.out.println(listName + printList);
    }

    private List<Integer> getListIntersection(
        ArrayList<Integer> firstArrayList,
        ArrayList<Integer> secondArrayList
    ) {
        List<Integer> listIntersection = new ArrayList<Integer>();

        for (Integer integer : firstArrayList) {
            if (secondArrayList.contains(integer) && !listIntersection.contains(integer)) {
                listIntersection.add(integer);
            }
        }

        return listIntersection;
    }

    private ArrayList<Integer> generateListNumbers(int n) {
        ArrayList<Integer> generatedList = new ArrayList<Integer>();
        int min = -10;
        int max = 10;

        for (int i = 0; i < n; i++) {
            generatedList.add(this.generateRandomNumber(min, max));
        }

        return generatedList;
    }

    private int generateRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }
}
