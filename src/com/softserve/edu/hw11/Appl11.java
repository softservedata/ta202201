package com.softserve.edu.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Appl11 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String criteria = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{12,}";

        int attempts=1;
        String pass;
        for (int k=1; k<=3; k++) {
            System.out.println("Please enter password: ");
            pass = br.readLine();
            if (Pattern.compile(criteria).matcher(pass).matches()) {
                System.out.println("Password meets criteria!");
                break;
            } else {
                System.out.print("Password does not meet criteria. ");
            }
            attempts = ++attempts;
            if (attempts > 3) {System.out.println("Sorry, you have used up all 3 attempts.");
            }
        }
        br.close();
    }
}
