package com.softserve.edu07abs;

public class AppFig {
    public static void main(String[] args) {
        // Figure figure = new Figure(""); // Compile Error.
        //
        Circle circle = new Circle(1);
//        Rectangle rectangle = new Rectangle(2, 3);
//        Figure circle = new Circle(1);
        Figure rectangle = new Rectangle(2, 3);
        //
        System.out.println("circle = " + circle.getName() + "   area = " + circle.getArea());
        System.out.println("rectangle = " + rectangle.getName() + "   area = " + rectangle.getArea());
        //
        Figure figure2 =  circle; // Upcasting
        System.out.println("Upcasting figure2 = " + figure2.getName() + "   area = " + figure2.getArea());
        //
        Rectangle rectangle2 = (Rectangle) rectangle; // Downcasting
        System.out.println("Downcasting rectangle2 = " + rectangle2.getName() + "   area = " + rectangle2.getArea());
        //
        // Circle circle2 = (Circle) rectangle; // Runtime Error
        Circle circle2 = null;
        if (rectangle instanceof Circle) {
            circle2 = (Circle) rectangle;
        }
        if (circle2 != null) {
            System.out.println("Downcasting circle2 = " + circle2.getName() + "   area = " + circle2.getArea());
        } else {
            System.out.println("Warning: circle2 is null");
        }
        /*
        Figure[] figures = {
                new Circle(1),
                new Rectangle(2, 3),
                new Rectangle(2, 1),
                new Circle(1)
        };
        for (Figure current : figures) {
            System.out.println("current = " + current.getName() + "   area = " + current.getArea());
        }
        */
    }
}
