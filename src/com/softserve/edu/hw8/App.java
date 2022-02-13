package com.softserve.edu.hw8;

// Написати інтерфейс Bird з методами boolean isFly(); і String getName(); та наслідує інтерфейс Comparable<Bird>.
// Створіть два абстрактних класи FlyingBird та NonFlyingBird, які наслідують інтерфейс Bird та реалізують метод isFly().
// Розробіть класи Eagle, Swallow, Penguin та Chicken, кожен з яких наслідує один з абстрактних класів FlyingBird або NonFlyingBird та реалізовує методи getName(), toString() і compareTo() на основі звертання до методу getName().
// Метод toString() при побудові стрічки повинен викликати методи getName() та isFly().
// В методі main() створіть масив birds типу Bird та додайте до нього різних птахів (можна захардкодити).
// Посортуйте масив birds та надрукуйте його елементи.

public class App {
    public static void main(String[] args) {
        BirdApp birdApp = new BirdApp();
        birdApp.printSortedBirds();
    }
}
