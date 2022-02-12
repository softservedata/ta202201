package com.softserve.edu.hw7;

public class FigureApp {
    public void printFiguresWithMaxPerimeterFromGenerated() {
        Figure[] getFigures = this.createFigures();
        double maxPerimeter = this.getMaximumPerimeter(getFigures);
        this.printFiguresWithMaxPerimeter(getFigures, maxPerimeter);
    }

    private Figure[] createFigures() {
        Figure[] figures = {
                new Triangle(3.09, 5.7, 7),
                new Rectangle(2.5, 6),
                new Rectangle(2, 8),
                new Square(5)
        };

        return figures;
    }

    private double getMaximumPerimeter(Figure[] figures) {
        double maxPerimeter = figures[0].getPerimeter();

        for (Figure figure : figures) {
            if (figure.getPerimeter() > maxPerimeter) {
                maxPerimeter = figure.getPerimeter();
            }
        }

        System.out.println("Maximum Perimeter = " + maxPerimeter);

        return maxPerimeter;
    }

    private void printFiguresWithMaxPerimeter(Figure[] figures, double maxPerimeter) {
        for (Figure figure : figures) {
            if (figure.getPerimeter() == maxPerimeter) {
                System.out.println("Figure with max Perimeter: " + figure.getName());
            }
        }
    }
}
