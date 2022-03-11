package com.softserve.edu.hw9;

import java.util.*;

public class MatchArray {
    public void getMatchArray(List<Integer> firstList, List<Integer> secondList){
        List<Integer> matchArray = new ArrayList<>();

        for (Integer first : firstList) {
            for (Integer second : secondList) {
                if (first.equals(second) && !matchArray.contains(first)) {
                    matchArray.add(first);
                }
            }
        }

        System.out.println(matchArray);
    }
}
