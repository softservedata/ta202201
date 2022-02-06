package com.softserve.edu.hw5;

import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public Product() {
        this.name = "";
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    public static void main(String[] args) {
        Product[] products = {new Product("Bread", 20), new Product("Butter", 76), new Product("Bread", 20),
                new Product("Cheese", 120), new Product("Bread", 20)};
        for (int i = 0; i < products.length; i++) {
            for (int j = 1; j < products.length; j++) {
                if (products[i].equals(products[j]) && (i < j)) {
                    System.out.println(products[i]);
                }
            }

        }
    }
}

