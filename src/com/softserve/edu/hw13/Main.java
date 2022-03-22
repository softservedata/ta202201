package com.softserve.edu.hw13;

public class Main {

	public static void main(String[] args) {
		
		Storage storage = new Storage();
		
		storage.setPersonsName(new Person("Kateryna"));
		storage.setPersonsName(new Person("Ivan"));
		storage.setPersonsName(new Person("Vadym"));
		storage.setPersonsName(new Person("Oleksiy"));
		storage.setPersonsName(new Person("Olena"));
		
		System.out.println("List: " + storage.getPersonsName().toString());
		storage.sorting();
		System.out.println("Sorted list: " + storage.getPersonsName());
		
	}
}
