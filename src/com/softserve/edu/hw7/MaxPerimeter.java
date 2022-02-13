package com.softserve.edu.hw7;

public class MaxPerimeter {


    public double getMaxPerimeter(Figure [] figures){
        double max = 0;
        for (Figure figure : figures){

            if (figure.getPerimeter() > max) max = figure.getPerimeter();
        }

        return max;
    }
}
