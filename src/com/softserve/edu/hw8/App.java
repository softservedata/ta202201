package com.softserve.edu.hw8;

/*
Homework 8 (from 11.02.2022)
        1) Написати інтерфейс Bird з методами boolean isFly(); і String getName(); та наслідує інтерфейс Comparable<Bird>.
        Створіть два абстрактних класи FlyingBird та NonFlyingBird, які наслідують інтерфейс Bird та реалізують метод isFly().
        Розробіть класи Eagle, Swallow, Penguin та Chicken, кожен з яких наслідує один з абстрактних класів FlyingBird або
        NonFlyingBird та реалізовує методи getName(), toString() і compareTo() на основі звертання до методу getName().
        В методі main() створіть масив birds типу Bird та додайте до нього різних птахів (можна захардкодити).
        Посортуйте масив birds та надрукуйте його елементи. Метод toString() при побудові стрічки повинен викликати методи getName() та isFly().
*/

import java.awt.print.Printable;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Bird[] birds = {
                new Swallow("Swaswa"),
                new Chicken("Coco"),
                new Eagle("RedEye"),
                new Penguin("Ping")
        };

        for (Bird current : birds) {
            System.out.println(current);
        }

        Arrays.sort(birds);

        System.out.println("Result: " + Arrays.toString(birds));
    }
}
