package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Enter third number: ");
        c = sc.nextInt();

        int[] array = new int[]{a, b, c};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


}
