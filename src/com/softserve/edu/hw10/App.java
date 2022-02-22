package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6, 3, 9, 0, 11, 13, 12));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 3));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(3, 3, 2, 2, 1, 1));

        System.out.println("First example: \n");

        System.out.println(list1 + " list1");
        System.out.println(list2 + " list2 \n" );
        HashSet<Integer> hashSet1 = new HashSet<>(list1);
        HashSet<Integer> hashSet2 = new HashSet<>(list2);
        System.out.println(hashSet1 + " hashSet1");
        System.out.println(hashSet2 + " hashSet2");
        boolean firstValue = hashSet1.equals(hashSet2);
        System.out.println("\nContent is equal: " + firstValue);

        System.out.println("\nSecond example: \n");

        System.out.println(list3 + " list3");
        System.out.println(list4 + " list4 \n" );
        HashSet<Integer> hashSet3 = new HashSet<>(list3);
        HashSet<Integer> hashSet4 = new HashSet<>(list4);
        System.out.println(hashSet4 + " hashSet3");
        System.out.println(hashSet3 + " hashSet4");
        boolean secondValue = hashSet3.equals(hashSet4);
        System.out.println("\nContent is equal: " + secondValue);
    }
}
