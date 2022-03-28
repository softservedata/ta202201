package com.softserve.edu.hw13;

/*Homework 13 (from 18.03.2022)
        1) Створити список List<String> names; з іменами людей.
        Посортувати цей список спочатку  по кількості символів у імені, а в межах однакової кількості - по алфавіту.
        Для сортування використати лямда вираз
        Collections.sort( (name1,name2)-> ... );
        Явно клас нащадка компаратора не створювати.
        Для коду використати пакет com.softserve.homework13
        Запушати код на github у свою вітку.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App13 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Oleh");
        names.add("Serhii");
        names.add("Olha");
        names.add("Halyna");

        names.sort((a,b) -> a.compareTo(b));
        System.out.println("Sorted lstStr = " + names);

        names.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else return a.length() - b.length();
        });
        System.out.println(names);

    }

}
