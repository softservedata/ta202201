package com.softserve.edu.hw10;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		int minRange = 1;
		int maxRange = 4;
		
		Random random = new Random();
		
		int rangeOfList1 = random.nextInt(maxRange - minRange) + minRange;
		int rangeOfList2 = random.nextInt(maxRange - minRange) + minRange;
		
		for (int i = 0; i < rangeOfList1; i++) {
			Integer n = random.nextInt(rangeOfList1);
			list1.add(n);
		}
		
		for (int i = 0; i < rangeOfList2; i++) {
			Integer n = random.nextInt(rangeOfList2);
			list2.add(n);
		}
		
		System.out.println("List 1: " + list1 + "\n" + "quantity: " + list1.size());
		System.out.println("List 2: " + list2 + "\n" + "quantity: " + list2.size());
		
		if (new HashSet<>(list1).containsAll(new HashSet<>(list2)) && new HashSet<>(list2).containsAll(new HashSet<>(list1))) {
			System.out.println("Lists are equals");
		} else System.out.println("Content of lists are different");
		
	}
	
}
