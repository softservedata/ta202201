package com.softserve.edu.hw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean isFound = false;

        Product[] products = {
                new Product("Snickers", 45),
                new Product("Mars", 40),
                new Product("Snickers", 45),
                new Product("Nuts", 35),
                new Product("Mars", 40),};


        System.out.println(Arrays.toString(products));
        for (int i = 0; i < products.length - 1; i++) {
            if (products[i] == null) {
                continue;
            }
            isFound = false;
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    if (!isFound) {
                        System.out.println(products[i]);
                        }
                    products[j] = null;
                    isFound = true;
                }
            }
        }

    }
}
