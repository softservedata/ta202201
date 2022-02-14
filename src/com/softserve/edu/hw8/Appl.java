package com.softserve.edu.hw8;

import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        Bird[] birds = {new Eagle("Griffin"), new Swallow("Birdie"), new Eagle("Ivy"), new Chicken("Hatcher"), new Penguin("Skipper")};
        Arrays.sort(birds);
        System.out.println(Arrays.toString(birds));
    }
}
