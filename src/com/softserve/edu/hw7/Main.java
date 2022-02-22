package com.softserve.edu.hw7;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle(2,5),
                new Rectangle(6,9),
                new Square(1.2),
                new Triangle(2.1, 3.4, 7.5)
        };

        String maxPerimeterFigure = "";
        double maxPerimeter = 0;

        for (Figure figure : figures){
            if (figure.getPerimeter() > maxPerimeter){
                maxPerimeter = figure.getPerimeter();
                maxPerimeterFigure = figure.toString();
            }
        }

        System.out.println("Figure: " + maxPerimeterFigure + " has max perimeter = " + maxPerimeter);

    }

}