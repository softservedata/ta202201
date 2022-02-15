package com.softserve.edu.hw5;

import java.util.Objects;

public class Product {
    String name;
    int price;

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

    public void setName(String name) {
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

    public static void main(String[] args) {
        Product product = new Product("Колбаса", 100);
        Product[] arr =
                {new Product("Coffee", 80),
                        product,
                        new Product("Tea", 50),
                        new Product("Coffee", 80),
                        new Product("Water", 20),
                        new Product("Coffee", 80),
                        new Product("Coffee", 80),
                        new Product("Tea", 50),
                        new Product("Tea", 50)
                };
        Product[] duplicate = new Product[arr.length];
        int indexOfLastDuplicate = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean skip = false;
            for (int index = 0; index < indexOfLastDuplicate; index++) {
                if (arr[i].equals(duplicate[index])) {
                    skip = true;
                    break;
                }
            }
            if (skip) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    duplicate[indexOfLastDuplicate] = arr[j];
                    indexOfLastDuplicate++;
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
