package com.softserve.edu.hw11;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		
		String password;
		Scanner scanner = new Scanner(System.in);
		
		String symbolsRange = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{12,}";
		
		System.out.println("Please enter password: ");
		password = scanner.next();
	
		while (!Pattern.compile(symbolsRange).matcher(password).matches()) {
			System.out.println("Password does not matches criterias");
			System.out.println("Please enter password: ");
			password = scanner.next();
		}
		System.out.println("Password is OK");
		
		
	}
	
}
