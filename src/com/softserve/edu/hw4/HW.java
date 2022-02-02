package com.softserve.edu.hw4;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int first = scanner.nextInt();

        System.out.print("Second number: ");
        int second = scanner.nextInt();

        System.out.print("Third number: ");
        int third = scanner.nextInt();

        System.out.print("Your numbers in ascending order: ");

        if (first < second && second < third)
            System.out.println(first + " " + second + " " + third);
        else if (first < third && third < second)
            System.out.println(first + " " + third + " " + second);
        else if (second < first && first < third)
            System.out.println(second + " " + first + " " + third);
        else if (second < third && third < first)
            System.out.println(second + " " + third + " " + first);
        else if (third < first && first < second)
            System.out.println(third + " " + first + " " + second);
        else if (third < second && second < first)
            System.out.println(third + " " + second + " " + first);

    }
}
