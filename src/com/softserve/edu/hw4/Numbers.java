package com.softserve.edu.hw4;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1: ");
        float a = scanner.nextFloat();
        System.out.print("2: ");
        float b = scanner.nextFloat();
        System.out.print("3: ");
        float c = scanner.nextFloat();

        System.out.print("Result: ");

        if (a >= b && a >= c){
            if (b >= c){
                System.out.println(c + " " + b + " " + a);
            } else  if (c >= b){
                System.out.println(b + " " + c + " " + a);
            }
        } else if (b >= a && b >= c){
            if (a >= c){
                System.out.print(c + " " + a + " " + b);
            } else System.out.print(a + " " + c + " " + b);
        } else if (c >= a && c >= b){
            if (b >= a){
                System.out.print(a + " " + b + " " + c);
            } else System.out.print(b + " " + a + " " +c);
        } else System.out.println(a + " " + b + " " + c);
    }

}
