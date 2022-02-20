package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<Integer> lstInt1 = new ArrayList<>();
        lstInt1.add(1);
        lstInt1.add(2);
        lstInt1.add(1);
        lstInt1.add(2);
        lstInt1.add(3);
        List<Integer> lstInt2 = new ArrayList<>();
        lstInt2.add(3);
        lstInt2.add(3);
        lstInt2.add(2);
        lstInt2.add(2);
        lstInt2.add(1);
        lstInt2.add(1);
        List<Integer> lstInt3 = new ArrayList<>();
        lstInt3 = App.commonElem(lstInt1,lstInt2);
        System.out.println(lstInt3);
    }
    private static List<Integer> commonElem(List<Integer> lstInt1, List<Integer> lstInt2){
        System.out.println("elements: " + lstInt1);
        System.out.println("elements: " + lstInt2);
        List<Integer> lstInt3 = new ArrayList<>();
        for (int i = 0; i < lstInt1.size(); i++) {
            if (lstInt2.contains(lstInt1.get(i)) && !lstInt3.contains(lstInt1.get(i))){
                System.out.println(lstInt1.get(i));
                lstInt3.add(lstInt1.get(i));
            }
        }
        System.out.println(lstInt3);
        return(lstInt3);
    }
}

