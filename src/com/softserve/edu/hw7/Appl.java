package com.softserve.edu.hw7;

public class Appl {
    public static void main(String[] args) {
        Figure[] arr = {
                new Rectangle(6, 4),
                new Rectangle(7, 6),
                new Square(6),
                new Triangle(6, 4, 5)
        };
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPerimetr() > arr[index].getPerimetr())
                index = i;
        }
        System.out.println(arr[index]);
    }
}
