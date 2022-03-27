package com.softserve.edu.hw9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/*Homework 9 (from 16.02.2022)
        1) Задати два списки (ArrayList), які містять цілі значення.
        На підставі цих двох лістів створити новий List, який містить лише спільні елементи з обох заданих списків.
        Для коду використати пакет com.softserve.homework9*/

public class App9 {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<Integer>();

        firstList.add(new Integer(15));
        firstList.add(new Integer(12));
        firstList.add(new Integer(13));
        firstList.add(new Integer(21));
        firstList.add(new Integer(36));
        firstList.add(new Integer(23));
        firstList.add(new Integer(2));

        List<Integer> secondList = new ArrayList<Integer>();

        secondList.add(new Integer(15));
        secondList.add(new Integer(21));
        secondList.add(new Integer(39));
        secondList.add(new Integer(9));
        secondList.add(new Integer(0));

        System.out.println("First list: " + firstList);
        System.out.println("Second list: " + secondList);

        ArrayList<Integer> commonList = new ArrayList<>();
        for (int current1 : firstList) {
            for (int current2 : secondList)
                if (!commonList.contains(current1) && current1 == current2)
                    commonList.add(current1);
        }
        System.out.println("1st approach: " + commonList);

        List<Integer> thirdList = new ArrayList<Integer>(firstList);
        thirdList.retainAll(secondList);
        System.out.println("2nd approach: " + thirdList);
    }
}
