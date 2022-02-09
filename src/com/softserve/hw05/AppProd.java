package com.softserve.hw05;

import java.util.Arrays;

public class AppProd {
    public static void main(String[] args) {
        boolean isFound = false;
        Product[] products = {
                new Product("Milk", 30),
                new Product("Coffee", 80),
                new Product("Bread", 20),
                new Product("Coffee", 80),
                new Product("Bread", 20),
                new Product("Coffee", 80)
        };
        //
        System.out.println("Origin Array:" + Arrays.toString(products));
        System.out.println("Duplicate Products:");
        //
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
