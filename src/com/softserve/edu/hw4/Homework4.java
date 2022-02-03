package com.softserve.edu.hw4;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.print("Input 1st number: ");
        int number1 = numbers.nextInt();

        System.out.print("Input 2nd number: ");
        int number2 = numbers.nextInt();

        System.out.print("Input 3rd number: ");
        int number3 = numbers.nextInt();

        System.out.println();

        int max = number1 >= number2 ? number1 : number2;
        max = max >= number3 ? max : number3;

        int min = number1 <= number2 ? number1 : number2;
        min = min <= number3 ? min : number3;

        int mid = number1 + number2 + number3 - max - min;

        System.out.println("Sorted numbers by ascending: " + min + " " + mid + " " + max);

    }
}
