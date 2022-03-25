package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password: ");
        String password = scanner.next();

        String pattern = ".*[a-z]+.*";
        String pattern1 = ".*[A-Z]+.*";
        String pattern2 = ".*[0-9]+.*";
        String pattern3 = ".*[^a-zA-Z0-9]+.*";
        String pattern4 = ".{12,}";

        if (Pattern.compile(pattern).matcher(password).matches() &&
                Pattern.compile(pattern1).matcher(password).matches() &&
                Pattern.compile(pattern2).matcher(password).matches() &&
                Pattern.compile(pattern3).matcher(password).matches() &&
                Pattern.compile(pattern4).matcher(password).matches()
        ) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }

    }
}
