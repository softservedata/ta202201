package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("You should set any number in format \"1\" or \"1,1\"");
        System.out.println("Enter first number: ");
        a = sc.nextDouble();
        System.out.println("Enter second number: ");
        b = sc.nextDouble();
        System.out.println("Enter third number: ");
        c = sc.nextDouble();

        System.out.println("result in ascending order: ");
        double[] array = new double[]{a, b, c};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


}
