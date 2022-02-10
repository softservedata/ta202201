package com.softserve.edu.hw7;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = {
                new Rectangle(3,4),
                new Rectangle(4,3),
                new Square(1.4),
                new Triangle(3.4, 4.4, 6.6)
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
