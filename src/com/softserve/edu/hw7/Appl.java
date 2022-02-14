package com.softserve.edu.hw7;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(3, 6), new Square(5), new Triangle(4, 8, 9), new Rectangle(3, 99)};
        System.out.println(Arrays.toString(figures));
        int iMax = Appl.maxPerimeter(figures);
        System.out.println("Max perimeter " + figures[3].getName());
        System.out.println("Max perimeter " + figures[3].getPerimeter());
    }

     private static int maxPerimeter(Figure[] figures) {
        int maxPerimeter = figures[0].getPerimeter();
        int iMax = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getPerimeter() > maxPerimeter) {
                maxPerimeter = figures[i].getPerimeter();
                iMax = i;
            }
        }
        return iMax;
    }
}
