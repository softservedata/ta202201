package com.softserve.edu.hw6;

public class Main {
    public static void main(String[] args) {
        Developer minDev = new Developer();

        Developer[] developers = {
                new Developer("Andrey", 20, "Front-end"),
                new Developer("Ilia", 21, "Back-end"),
                new Developer("Dmitrii", 22, "Test Automation"),
                new Developer("Ihor", 23, "QA"),
                new Developer("Yulia", 24, "DevOps"),
                new Developer("Sonia", 25, "Java Dev")
        };

        System.out.println("Youngest Engineer is: " + minDev.getMinAgeDev(developers));

    }
}
