package com.softserve.edu.hw7;

public class Appl7 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(3, 4),
                new Rectangle(5, 6),
                new Square(5),
                new Triangle(15, 6, 8)
        };
        int imax = 0;
        double maxPer=figures[0].getPerimeter();

        for (int i=0; i< figures.length; i++) {
            if (figures[i].getPerimeter() > maxPer) {
                maxPer = figures[i].getPerimeter();
                imax = i;
            } else {continue;}
        }
        System.out.println("Max perimeter figure is " + figures[imax].getName() + " with " + figures[imax].getPerimeter());
    }
}
