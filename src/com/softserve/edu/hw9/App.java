package com.softserve.edu.hw9;

import java.util.*;

public class App {
    public static void main(String[] args){

        List<Integer> firstList = new ArrayList<Integer>()
        {{
            add(0);
            add(53);
            add(5);
            add(17);
        }};

        List<Integer> secondlist = new ArrayList<Integer>()
        {{
            add(0);
            add(17);
            add(53);
            add(1);
        }};

        System.out.println("First List: " + firstList);
        System.out.println("Second List: " + secondlist);

        MatchArray matchedArray = new MatchArray();
        matchedArray.getMatchArray(firstList, secondlist);
        
    }

}
