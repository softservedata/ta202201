package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        Random random = new Random();

        int range = 10;

        for (int i = 0; i < range; i++) {
            Integer n = random.nextInt(range);
            list1.add(n);
        }

        for (int i = 0; i < range; i++) {
            Integer n = random.nextInt(range);
            list2.add(n);
        }

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        for (Integer integer : list1) {
            for (Integer value : list2) {
                if (integer.equals(value) && !list3.contains(integer)) {
                    list3.add(integer);
                }
            }
        }

        System.out.println("List3: " + list3);

    }

}
