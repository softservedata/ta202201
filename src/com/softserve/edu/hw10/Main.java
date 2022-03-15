package com.softserve.edu.hw10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(6);
        list2.add(7);
        list2.add(4);
        System.out.println(list2);

        System.out.println(list.containsAll(list2) && list2.containsAll(list));
    }
}


