package com.softserve.edu.hw5;

import java.util.Objects;

public class Products {
    private String name;
    private int price;

    public Products() {
        this.name = "";
        this.price = 0;
    }

    public Products(String name, int price) {
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
    public String toString() {
        return "Product{" +
                "name='" + name +
                "  price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return price == products.price && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public static void main(String[] args){

        Products[] products = new Products[5];
        products[0] = new Products("Water", 2);
        products[1] = new Products("Bread", 10);
        products[2] = new Products("Lemon", 25);
        products[3] = new Products("Lemon", 25);
        products[4] = new Products("Bread", 10);


        for (int i = 0; i < products.length - 1; i++){
            for (int j = i; j < products.length - 1; j++){
                if (products[i].equals(products[j + 1])){
                    System.out.println("Duplicates: \n" + products[i] + "\n" + products[j + 1]);
                }
            }

        }
    }
}
