package com.softserve.edu.hw7;

import java.sql.SQLOutput;

public class App {

    public static void main (String[] args){
        Figure [] figures = {
                new Rectangle (3, 5), // 16
                new Rectangle (10, 26), // 72
                new Square(42),  // 131.88
                new Triangle(8, 5, 11)
        };
        MaxPerimeter maxPerimeter = new MaxPerimeter();

        System.out.println("Maximum perimeter: " + maxPerimeter.getMaxPerimeter(figures));
    }
}
