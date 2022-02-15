package com.softserve.edu.hw7;

public class MaxPerimeter {


    public double getMaxPerimeter(Figure [] figures){
        double max = 0;
        for (Figure figure : figures){

            if (figure.getPerimeter() > max) max = figure.getPerimeter();
        }
        for (Figure figure : figures){
            if (figure.getPerimeter() == max){
                System.out.println("Figure with maximum perimeter: " + figure.getName());
            }
        }

        return max;
    }
}
