package com.softserve.edu.hw7;

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(3, 4),
                new Rectangle(5, 6),
                new Square(7),
        new Triangle(4, 6, 8)
        };
        double maxPer=figures[0].getPerimeter();
        System.out.println(maxPer);
        for (int i=1; i<= figures.length; i++) {
            if (figures[i].getPerimeter()>maxPer) {
                maxPer = figures[i].getPerimeter();
            }
        }
        System.out.println("Max per figure is " + );
    }
}
