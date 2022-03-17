package com.softserve.edu.hw11;

import java.util.Scanner;

public class App {

    public static void main (String args[]){

        PasswordValidation validator = new PasswordValidation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password!");
        String password = scanner.nextLine();
        if (validator.isValidPassword(password)){
            System.out.println("Password great!");
        } else System.out.println("Weak password!");
    }
}
