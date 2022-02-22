package com.softserve.edu.hw5;

import java.util.Objects;

public class Product {
    private String name;
    private int price;

    public Product() {
        this.name = "";
        this.price = 0;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Product products[] = {new Product("Onion", 20),
                new Product("Potato", 15),
                new Product("Potato", 15),
                new Product("Tomato", 25),
                new Product("Tomato", 25),
                new Product("Strawberry", 50)};

        for (int i = 0; i < products.length; i++) {
            for (int t = i + 1; t < products.length; t++) {
                if (products[i].equals(products[t])) {
                    System.out.println(products[i] + " equals to " + products[t]);
                }
            }
        }

    }
}

