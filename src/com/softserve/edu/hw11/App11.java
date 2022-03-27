package com.softserve.edu.hw11;

/*Homework 11 (from 23.02.2022)
        1) Нехай згідно вимог пароль користувача повинен бути не коротшим за 12 символів та містити великі та малі букви латинського алфавіту,
        цифри і спецсимволи.   Використовуючи регулярні вирази, виконайте перевірку пароля користувача на валідність.
        Для коду використати пакет com.softserve.homework11
        Запушати код на github у свою вітку.*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class App11 {
    public static void main(String[] args) {
        Scanner passwordInput = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = passwordInput.next();
        String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[^a-zA-Z0-9]).{12,}$";

        if (Pattern.compile(pattern).matcher(password).matches()) {
            System.out.println("OK");
        } else {
            System.out.println("Password is not valid");
        }
    }
}
