package com.softserve.edu.hw8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Bird[] birds = {
                new Chicken("chicken 1"),
                new Eagle("eagle 1"),
                new Swallow("swallow 2"),
                new Eagle("eagle 3"),
                new Chicken("chicken 2"),
                new Swallow("swallow 1"),
                new Penguin("penguin 2"),
                new Chicken("chicken 3"),
                new Eagle("eagle 2"),
                new Penguin("penguin 1")
        };

        Arrays.sort(birds);
        System.out.println(Arrays.toString(birds));

    }

}