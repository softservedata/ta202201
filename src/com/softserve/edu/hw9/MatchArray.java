package com.softserve.edu.hw9;

import java.util.*;

public class MatchArray {
    public void getMatchArray(List<Integer> firstList, List<Integer> secondList){
        List<Integer> matchArray = new ArrayList<Integer>();

        for (int i = 0; i < firstList.size(); i++){
            for (int j = 0; j < secondList.size(); j++){
                if (firstList.get(i).equals(secondList.get(j))) {
                    matchArray.add(firstList.get(i));
                }
            }
        }

        System.out.println(matchArray);
    }
}
