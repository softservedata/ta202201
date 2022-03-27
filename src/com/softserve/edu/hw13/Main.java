package com.softserve.edu.hw13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Sergiy");
        list.add("Igor");
        list.add("Boris");
        list.add("Andriy");
        list.add("Roman");
        System.out.println(list);
        list.sort((name1, name2) -> {
            if (name1.length() == name2.length()) {
                return name1.compareTo(name2);
            } else return name1.length() - name2.length();
        });
        System.out.println(list);
    }
}
