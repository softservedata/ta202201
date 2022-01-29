package com.softserve.edu.hw4;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if (a > b && a > c){
            if (b > c && b < a){
                System.out.println(c + " " + b + " " + a);
            } else System.out.println(b + " " + c + " " + a);
        } else if (b > a && b > c){
            if (a < b && a > c){
                System.out.print(c + " " + a + " " + b);
            } else System.out.print(a + " " + c + " " + b);
        } else if (c > a && c > b){
            if (b < c && b > a){
                System.out.print(a + " " + b + " " + c);
            } else System.out.print(b + " " + a + " " +c);
        }
    }

}
