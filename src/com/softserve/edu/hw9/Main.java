package com.softserve.edu.hw9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(1);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(6);
        list2.add(7);
        list2.add(9);
        System.out.println(list2);

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : list) {
            for (int j : list2)
                if (!arr.contains(i) && i == j)
                    arr.add(i);
        }
        System.out.println(arr);
    }
}
