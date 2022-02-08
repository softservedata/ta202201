package com.softserve.edu.hw6;

public class Main {
    public static void main(String[] args) {
        Developer[] arr = {
                new Developer("Andrey", 60, "java"),
                new Developer("Vasya", 55, "python"),
                new Developer("Petya", 60, "c++"),
                new Developer("Lyesha", 15, "ruby"),
                new Developer("Kuzya", 23, "java"),
                new Developer("Roman", 34, "node"),
                new Developer("Sergey", 23, "java")
        };
        int minAge = arr[0].getAge();
        for (Developer dev : arr) {
            if (dev.getAge() <= minAge && dev.getDirection().equals("java")) minAge = dev.getAge();
        }
        System.out.println("minAge-" + minAge);
        for (Developer dev : arr) {
            if (dev.getDirection().equals("java") && dev.getAge() == minAge)
                System.out.println(dev);
        }
    }

}
