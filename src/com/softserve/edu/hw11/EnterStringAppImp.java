package com.softserve.edu.hw11;

import java.util.Scanner;

public class EnterStringAppImp implements EnterStringApp {
    public String enterPassword() {
        Scanner terminalReader = new Scanner(System.in);

        System.out.println(MessageTitles.enterPassword);

        return terminalReader.nextLine();
    }
}
