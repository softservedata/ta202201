package com.softserve.edu.hw10;

/*Homework 10 (from 18.02.2022)
        1) Задати два списки (ArrayList), які містять цілі значення.
        Кількість елементів у списках може бути різною, а самі елементи можуть дублюватися.
        Вияснити, чи контент елементів у списках співпадає.
        Наприклад, вміст наступних списків є однаковий [1, 2, 1, 2, 3] та [3, 3, 2, 2, 1, 1]
        Для коду використати пакет com.softserve.homework10
        Запушати код на github у свою вітку.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App10 {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<Integer>();

        firstList.add(new Integer(15));
        firstList.add(new Integer(12));
        firstList.add(new Integer(13));
        firstList.add(new Integer(21));
        firstList.add(new Integer(36));
//        firstList.add(new Integer(23));
//        firstList.add(new Integer(2));

        List<Integer> secondList = new ArrayList<Integer>();

        secondList.add(new Integer(36));
        secondList.add(new Integer(21));
        secondList.add(new Integer(15));
        secondList.add(new Integer(12));
        secondList.add(new Integer(13));

        System.out.println("First list: " + firstList);
        System.out.println("Second list: " + secondList);

        HashSet<Integer> firstHash = new HashSet<>(firstList);
        HashSet<Integer> secondHash = new HashSet<>(secondList);
        System.out.println(firstHash);
        System.out.println(secondHash);

        boolean equal = firstHash.equals(secondHash);

        System.out.println("Lists are equal?: " + equal);
    }
}
