package com.softserve.edu.hw8;

import java.util.Arrays;

public class Application {

        public static void main(String[] args) {
            Bird[] birds = {
                    new Chicken("Kuritza"),
                    new Swallow("Lastochka"),
                    new Penguin("Pengvin"),
                    new Eagle("Orel")
            };
            Arrays.sort(birds);
            System.out.println(Arrays.toString(birds));
        }
    }

