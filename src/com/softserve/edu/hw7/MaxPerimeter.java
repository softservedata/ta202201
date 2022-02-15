package com.softserve.edu.hw7;

public interface MaxPerimeter {
    static double getMaxPerimeter(Figure [] figures){
        double max = 0;
        for (Figure figure : figures){

            if (figure.getPerimeter() > max) max = figure.getPerimeter();
        }
        for (Figure figure : figures){
            if (figure.getPerimeter() == max){
                String result = String.valueOf(figure.getClass());
                result = result.replace("class com.softserve.edu.hw7.", "");
                System.out.println("Figure with maximum perimeter: " + result);
            }
        }

        return max;
    }
}
