package com.softserve.edu.hw5;

import java.util.Arrays;

public class Program {
    public static void main (String[] args) {
        Product[] prods = {
                new Product("Apple", 40),
                new Product("Orange", 41),
                new Product("Apple", 40),
                new Product("Orange", 41),
                new Product("Apple", 40),
                new Product("Orange", 41),
                new Product("Kiwi", 51)};
        boolean isFound = false;

        for (int i=0; i< prods.length-1; i++) {
            if (prods[i] == null) continue;
            for (int j=i+1; j< prods.length; j++) {
                if (prods[i].equals(prods[j])) {
                    if (!isFound) {
                        System.out.println(prods[i]); }
                        prods[j] = null; }
            }
            }
    }
}
