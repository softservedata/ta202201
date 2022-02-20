package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<Integer> lstInt1 = new ArrayList<>();
        lstInt1.add(1);
        lstInt1.add(2);
        lstInt1.add(1);
        lstInt1.add(2);
        lstInt1.add(3);
        List<Integer> lstInt2 = new ArrayList<>();
        lstInt2.add(3);
        lstInt2.add(3);
        lstInt2.add(2);
        lstInt2.add(2);
        lstInt2.add(1);
        lstInt2.add(1);
        System.out.println(lstInt1 + "lstInt1");
        System.out.println(lstInt2 + "lstInt2");
        HashSet<Integer> hashSet1 = new HashSet<>(lstInt1);
        HashSet<Integer> hashSet2 = new HashSet<>(lstInt2);
        System.out.println(hashSet1 + "hashSet1");
        System.out.println(hashSet2 + "hashSet2");
        boolean value
                = hashSet1.equals(hashSet2);
        System.out.println("Content is equal: " + value);
    }
}

