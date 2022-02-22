package com.softserve.edu.hw8;

import java.util.Arrays;

public class Appl8 {
    public static void main(String[] args) {

        Bird [] birds = {
                new Chicken("Chikky"),
                new Eagle("Eagy"),
                new Swallow("Swally"),
                new Penguin("Pen-Pen"),
                new Eagle("Beagle")
        };
        System.out.print("\n Non sorted birds: " + Arrays.toString(birds)+"\n");
        Arrays.sort(birds);
        System.out.println("\n Sorted by name birds: " + Arrays.toString(birds));
    }
}
