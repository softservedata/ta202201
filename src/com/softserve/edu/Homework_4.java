package com.softserve.edu;

import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = sc.nextInt();
        System.out.println("Please enter the second number");
        int b = sc.nextInt();
        System.out.println("Please enter the third number");
        int c = sc.nextInt();
        // setting up biggest number
        int maxi = a;
        if (b > maxi) maxi = b;
        if (c > maxi) maxi = c;
        //setting up smallest number
        int mini = a;
        if (b < mini) mini = b;
        if (c < mini) mini = c;
        // setting up middle number
        int midi = a;
        if ((b < midi && b > c) || (b > midi && b < c)) midi = b;
        if ((c < midi && c > b) || (c > midi && c < b)) midi = c;

        System.out.println("The order is: \n" + mini + "\n" + midi + "\n" + maxi);
    }
}
