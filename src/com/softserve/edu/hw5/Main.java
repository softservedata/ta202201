package com.softserve.edu.hw5;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product("Snack", 4),
                new Product("Cheese", 6),
                new Product("Snack", 4),
                new Product("Cheese", 7),
                new Product("Water", 1)
        };

        Product repeatedProduct = new Product();

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (!(i == j) && products[i].hashCode() == products[j].hashCode()) {
                    if (products[i].equals(products[j])) {
                            repeatedProduct = products[i];
                    }
                }
            }
        }

        System.out.println("Repeated product: " + repeatedProduct.getProductName());
    }
}
