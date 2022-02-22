package com.softserve.edu.hw8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bird[] birds = {
                new Eagle("eagle"),
                new Swallow("swallow"),
                new Penguin("penguin"),
                new Chicken("chicken"),
                new Eagle("eagle"),
                new Swallow("swallow"),
                new Penguin("penguin"),
                new Chicken("chicken"),
                new Eagle("eagle"),
                new Swallow("swallow"),
                new Penguin("penguin"),
                new Chicken("chicken")
        };

        Arrays.sort(birds);
        System.out.println(Arrays.toString(birds));

    }
}
