package com.softserve.edu.hw5;

/*
    Створити клас Product з такими полями: назва продукту (тип String) та ціна (тип int).
    Клас повинен містити конструктор, гетери та сетери, методи toString(), equals().
    В методі main створити масив з п'яти екземплярів типу Product. Можна захардкодити, наприклад:
    Product products = {new Product("Coffee", 80), new Product("Bread", 20), ...};
    Вивести на екран продукти, які повторюються (натайпати, щоб співпадіння були).
    Для коду використати пакет com.softserve.edu.hw5
    Запушати код на github у свою вітку.
*/

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
