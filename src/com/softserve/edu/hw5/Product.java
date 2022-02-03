package com.softserve.edu.hw5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
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

    public static void main(String[] args) {
        Product[] products = {
                new Product("Bread", 12),
                new Product("Bread", 12),
                new Product("Carrot", 6),
                new Product("Carrot", 6),
                new Product("Eggs", 12),
                new Product("Bread", 12)
        };

        for (int i = 0; i < products.length-1; i++) {
            boolean found = false;
            if(products[i] == null){
                continue;
            }
            for (int j = i+1; j< products.length; j++){
                if(products[j] != null && products[i].equals(products[j])){
                    found = true;
                    products[j] = null;
                }
            }
            if(found){
                System.out.println(products[i]);
            }
        }
    }
}
