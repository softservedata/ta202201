package com.softserve.edu.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello. enter 1st value: ");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Ok, enter 2nd value: ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("Cool. enter 3rd value: ");
        int c = Integer.parseInt(br.readLine());

        System.out.println("Hello " + a + b + c);
/*-
abc acb bac bca cab cba
123 132 213 231 312 321
 */
        if ((a < b) && (b < c)) {
            System.out.println("Correct order is 1" + a + " " + b + " " + c);
        } else if ((a < b) && (a < c)) {
            System.out.println("Correct order is 2" + a + " " + c + " " + b);
        } else if ((a > b) && (b < c) && (a < c)) {
            System.out.println("Correct order is 3" + b + " " + a + " " + c);
        } else if ((a < b) && (a > c)) {
            System.out.println("Correct order is 4" + c + " " + a + " " + b);
        } else if ((b < c) && (a > c)) {
            System.out.println("Correct order is 5" + b + " " + c + " " + a);
        } else if ((a > b) && (b > c)) {
            System.out.println("Correct order is 6" + c + " " + b + " " + a);
        }
    }
}