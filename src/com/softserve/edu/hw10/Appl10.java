package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;

public class Appl10 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(3);        l1.add(4);        l1.add(5);        l1.add(6);        l1.add(12);
        l2.add(4);        l2.add(6);        l2.add(3);        l2.add(12);        l2.add(5);     l2.add(12);     l2.add(5);

        System.out.println("First array list:  " + l1);
        System.out.println("Second array list: " + l2);

        if (l1.containsAll(l2) && l2.containsAll(l1)) {
            System.out.println("Lists are the same");
        } else {
            System.out.println("Lists are NOT the same");
        }
    }
}
