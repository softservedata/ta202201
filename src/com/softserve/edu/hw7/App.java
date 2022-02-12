package com.softserve.edu.hw7;

// Написати абстрактний клас Figure із абстрактним методом обчислення периметру.
// Написати класи Rectangle, Square та Triangle, які наслідують Figure.
// В методі main класу Appl створити масив, який складається із двох прямокутників, квадрата та трикутника.
// Знайти фігуру з максимальним периметром.
// Для коду використати пакет com.softserve.edu.hw7
// Запушати код на github у свою вітку.

public class App {
    public static void main(String[] args) {
        FigureApp figureApp = new FigureApp();
        figureApp.printFiguresWithMaxPerimeterFromGenerated();
    }
}
