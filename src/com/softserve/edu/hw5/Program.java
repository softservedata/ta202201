package com.softserve.edu.hw5;

public class Program {
    public static void main (String[] args) {
        Product[] prods = {new Product("Apple", 40), new Product("Orange", 40), new Product("Apple", 45), new Product("Orange", 50), new Product("Kiwi", 50)};

        for (int i=0; i<prods.length; i++) {
            for (int j = 0; j < prods[i].length; j++) {
                System.out.println(prods[i][j].getProductName + " ");
            }
        }
    }
}
