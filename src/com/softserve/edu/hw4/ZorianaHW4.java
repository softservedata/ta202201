package com.softserve.edu.hw4;

import java.util.Scanner;

public class ZorianaHW4 {

    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        float number1 = scanner.nextFloat();
        System.out.println("Enter the second number");
        float number2 = scanner.nextFloat();
        System.out.println("Enter the third number");
        float number3 = scanner.nextFloat();
        System.out.println("number1 = " + number1 + " number2 = " + number2 + " number3 = " + number3);
        scanner.close();
        if ((number1 <= number2) && (number1 <= number3)) {
            if (number2 <= number3) {
                System.out.println("Asc " + number1 + " , " + number2 + " , " + number3);
            } else {
                System.out.println("Asc " + number1 + " , " + number3 + " , " + number2);
            }
        } else if ((number1 <= number2) && (number3 <= number1)) {
            System.out.println("Asc " + number3 + " , " + number1 + " , " + number2);
        } else if ((number2 <= number1) && (number1 <= number3)) {
            System.out.println("Asc " + number2 + " , " + number1 + " , " + number3);
        } else if ((number2 <= number1) && (number3 <= number1)) {
            if (number2 <= number3) {
                System.out.println("Asc " + number2 + " , " + number3 + " , " + number1);
            } else {
                System.out.println("Asc " + number3 + " , " + number2 + " , " + number1);
            }
        }else{
            System.out.println("Sth is missing");
        }
    }
}