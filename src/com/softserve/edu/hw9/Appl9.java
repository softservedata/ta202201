package com.softserve.edu.hw9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl9 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(3);l1.add(4);l1.add(5);l1.add(6);l1.add(12);
        l2.add(4);l2.add(6);l2.add(8);l2.add(10);l2.add(12);

        System.out.println("First array list:  "+ l1);
        System.out.println("Second array list: " +l2);
        
        List<Integer> l3shared = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            if (l2.contains(l1.get(i)) && !l3shared.contains(l1.get(i))) {
                l3shared.add(l1.get(i));
            }
        }
        System.out.println("Common elements are " + l3shared);
    }
}
