package com.softserve.edu.hw5;

public class App {
    public static void main(String[] args) {
        App.printDuplicatedProducts(
                App.generateProducts()
        );
    }

    private static Product[] generateProducts() {
        Product[] generatedProducts = {
                new Product("Coffee", 80),
                new Product("Tea", 40),
                new Product("Nuts", 80),
                new Product("Coffee", 80),
                new Product("Coffee", 140)
        };
        return generatedProducts;
    }

    private static void printDuplicatedProducts(Product[] products){
        for (int i = 0; i < products.length; i++) {
            for (int j = 1; j < products.length; j++){
                if (products[i].equals(products[j])) {
                    System.out.println(products[j]);
                }
            }
        }
    }
}
