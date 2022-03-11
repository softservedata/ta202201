package com.softserve.edu.hw10;

import java.util.*;

public class CompareList {

    public boolean isTheSameList(List<Integer> firstList, List<Integer> secondList){
        return firstList.containsAll(secondList) && secondList.containsAll(firstList);
    }

    public CompareList() {
    }
}
