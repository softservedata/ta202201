package com.softserve.edu.hw13;

import java.util.*;
/*
list of names is sorted by name A-Z, then
list of names is sorted from the longest name to the shortest
* commented is another solution for sorting
 */
public class Appl13 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Petro", "Severyn", "Stepan", "Dmytro", "Oles");
        names.sort((a,b)-> a.compareTo(b).);
        Collections.sort(names, (b, a)->Integer.compare(a.length(), b.length()));
        //names.sort(Comparator.comparing(String::length).thenComparing(String::compareToIgnoreCase));
        System.out.println(names);
    }
}
