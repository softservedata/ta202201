package com.softserve.edu.hw6;

import java.util.Scanner;

public class App6 {
    public static void main (String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in a number of developers: ");
        int num = sc.nextInt();

        for (int i=0; i<num; i++) {
            System.out.println("Please enter a developer's name: ");
            String n = sc.nextLine();
            System.out.println("Please enter the dev's age: ");
            int a = sc.nextInt();
            System.out.println("Please enter dev's direction: ");
            String d = sc.nextLine();
            Developer[] devs = { new Developer(n, a, d)};
            sc.close();
        }
*/
        Developer[]devs = {
                new Developer("Syed", 35, "C#"),
                new Developer("Richard", 36, "C#"),
                new Developer("Valentyn", 30, "Java"),
                new Developer("Dmytro K", 25, "Java"),
                new Developer("Oleh", 45, "Java")
        };

            int imin = 0;
            int min = devs[0].getAge();
            for (int i = 0; i < devs.length; i++) {
                if (devs[i].getDirection().equals("Java") && devs[i].getAge() < min) {
                    min = devs[i].getAge();
                    imin = i;
                }
            }
            System.out.println(devs[imin]);

    }
}
