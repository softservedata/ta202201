package com.softserve.hw09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl09 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6, 3, 9, 0, 11));
        //
        List<Integer> list3 = new ArrayList<>(list1);
        list3.retainAll(list2);
        System.out.println(list3);
    }

}
