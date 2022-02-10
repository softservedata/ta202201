package com.softserve.edu.hw5;
import java.util.Arrays;

public class Product {
    private String productName;
    private int productPrice;

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public boolean equals(Product product) {
        return this.productName ==  product.productName;
    }

    @Override
    public String toString() {
        return productName + " - " + productPrice + "uah";
    }

    public String getProductName() {
        return productName;
    }
    public String setProductName() {
        return productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public int setProductPrice() {
        return productPrice;
    }

    public static void main(String[] args) {
        Product products[] = {
                new Product("Orange", 40),
                new Product("Banana", 30),
                new Product("Mango", 80),
                new Product("Kiwi", 35),
                new Product("Banana", 45)
        };

        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.equals(products, products));
        if ((Arrays.equals(products, products)) == true) {
            System.out.println(products);
        }
    }
}
