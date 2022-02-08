package com.softserve.edu.hw5;

import java.util.Arrays;

public class Program {
    public static void main (String[] args) {
        Product[] prods = {
                new Product("Apple", 40),
                new Product("Orange", 41),
                new Product("Apple", 40),
                new Product("Orange", 50),
                new Product("Kiwi", 51)};
        //Product prods2[] = prods;

        for (int i=0; i< prods.length; i++) {
            //int j=1;
            //if (j<prods.length) {j = j++;} else {j= prods.length-1;}
            for (int j=0; j< prods.length; j++) {
                if (prods[i].equals(prods[j])) System.out.println(prods[j]);
            }
            }

    }
}
