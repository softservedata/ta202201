package com.softserve.edu13lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ApplFunction {
	public static void main(String[] args) {
		/*-
		Predicate<String> predicate1 = (s) -> s.length() > 1;
		//List<String> names = Arrays.asList(new String[] {"Angela", "Aaron", "Bob", "Claire", "David"});
		List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David", "A");
		Predicate<String> predicate = name -> name.startsWith("A");
		System.out.println("Origin: " + names);
		List<String> namesWithA = names.stream()
				.filter(name -> name.startsWith("A"))
				//.filter(predicate)
				.filter(predicate1)
				.collect(Collectors.toList());
		System.out.println("Modify: " + namesWithA);
		*/
		/*-
		Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
		String s = "123";
		int i = stringToInt.apply(s) + 2;
		System.out.println("i = " + i);
		*/
		/*-
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		names.forEach(name -> System.out.println("Hello, " + name));
		*/
	}
}
