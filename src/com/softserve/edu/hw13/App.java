package com.softserve.edu.hw13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main (String[] args){

        List<String> nameList = new ArrayList<>();
        nameList.add("Iryna");
        nameList.add("Vladyslav");
        nameList.add("Tom");
        nameList.add("Olga");
        nameList.add("Tim");

        System.out.println(nameList);

        //Collections.sort(nameList);
        //Collections.sort(nameList, Comparator.comparing(String::length));

        nameList.sort((String name1, String name2) -> {
            if (name1.length() == name2.length()) {
                return name1.compareTo(name2);
            } else return name1.length() - name2.length();

        });

        System.out.println(nameList);

    }
}
