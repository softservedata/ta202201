package com.softserve.edu.hw7;

/*
Homework 7 (from 09.02.2022)
        1) Написати абстрактний клас Figure із абстрактним методом обчислення периметру.
        Написати класи Rectangle, Square та Triangle, які наслідують Figure.
        В методі main класу Appl створити масив, який складається із двох прямокутників, квадрата та трикутника.
        Знайти фікуру з максимальним периметром.
        Для коду використати пакет com.softserve.edu.hw7
        Запушати код на github у свою вітку.
*/
public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(27, 12, 4),
                new Rectangle(12, 8),
                new Square(5),
                new Rectangle(11, 10)
        };

        double max_perimeter = 0;

        for (Figure current : figures)
            if (current.getPerimeter() > max_perimeter)
                max_perimeter = current.getPerimeter();
        for (Figure current : figures)
            if (current.getPerimeter() == max_perimeter)
        System.out.println(current.getClass().getName().toString() + " " + current.getPerimeter());
    }
}
