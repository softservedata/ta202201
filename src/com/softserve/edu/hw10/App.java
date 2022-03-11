package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<Integer>() {{
            add(0);
            add(53);
            add(17);
            add(1);
        }};

        List<Integer> secondlist = new ArrayList<Integer>() {{
            add(0);
            add(17);
            add(0);
            add(53);
            add(1);
            add(1);
        }};

        System.out.println("First List: " + firstList);
        System.out.println("Second List: " + secondlist);

        CompareList compare = new CompareList();

        if (compare.isTheSameList(firstList, secondlist)){
            System.out.println("Lists are the same");
        } else System.out.println("Lists are different");
    }
}