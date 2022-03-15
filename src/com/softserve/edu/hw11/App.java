package com.softserve.edu.hw11;

//Нехай згідно вимог пароль користувача повинен бути не коротшим за 12 символів та містити великі
//та малі букви латинського алфавіту, цифри і спецсимволи.
//Використовуючи регулярні вирази, виконайте перевірку пароля користувача на валідність.
//Для коду використати пакет com.softserve.homework11
//Запушати код на github у свою вітку.

public class App {
    public static void main(String[] args) {
        EnterStringApp passwordApp = new EnterStringAppImp();
        String password = passwordApp.enterPassword();

        ValidateStringApp validateApp = new ValidateStringAppImp();
        validateApp.validatePassword(password);
    }
}
