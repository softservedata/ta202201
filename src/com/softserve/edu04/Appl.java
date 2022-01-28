package com.softserve.edu04;

import java.io.IOException;
import java.util.Scanner;

public class Appl {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        String name = sc.nextLine();
        System.out.print("How old are you? ");
        //int age = Integer.parseInt(sc.readLine());
        int age = sc.nextInt();
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
        //
        System.out.print("input string = ");
        String s = sc.nextLine();
        //sc.reset();
        s = sc.nextLine();
        System.out.print("string = " + s);
        sc.close();
    }
}
