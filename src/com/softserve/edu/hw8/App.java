package com.softserve.edu.hw8;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Bird[] birds = {
                new Chicken("Coco"),
                new Swallow("Kate"),
                new Eagle("Tom"),
                new Chicken("Tom"),
                new Penguin("John")
        };
        System.out.println("Original array: " + Arrays.toString(birds));
        Arrays.sort(birds);
        System.out.println("\nSorted array: " + Arrays.toString(birds));
    }
}
