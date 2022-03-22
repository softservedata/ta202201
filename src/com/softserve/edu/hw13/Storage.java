package com.softserve.edu.hw13;

import java.util.*;

public class Storage {
	
	public List<Person> personsName = new ArrayList<>();
	
	public void setPersonsName(Person person) {
		personsName.add(person);
	}

	public List<Person> getPersonsName() {
		return personsName;
	}
	
	public void sorting() {
		Collections.sort(personsName, (o1, o2) -> {
			int result =  o1.getName().length() - o2.getName().length();
			if (result == 0) {
				return o1.name.compareTo(o2.name);
			}
			return result;
		});
	}
}
