package com.softserve.edu.hw7;

public class App implements MaxPerimeter{


    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle(3, 8),
                new Rectangle(2, 6),
                new Square(6),
                new Triangle(5, 2, 3),
        };

        System.out.println("Perimeter: " + MaxPerimeter.getMaxPerimeter(figures));
    }
}
