package com.softserve.edu.hw5;

import java.util.Arrays;
import java.util.Objects;

public class Product {
    private String name;
    private int price;

    //public int Product() {
    //   this.name = "";
    //   this.price = 0;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
        }
        public void setName (String name){
            this.name = name;
        }

    public void setPrice(int price) {
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

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public static void main(String[] args) {
        boolean isFound = false;

        Product[] products = {new Product("Snickers", 45),
                new Product("Mars", 40),
                new Product("Snickers", 45),
                new Product("Nuts", 35),
                new Product("Snickers", 45),};

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



