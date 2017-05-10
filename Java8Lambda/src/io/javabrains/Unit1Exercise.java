package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroli", 42),
				new Person("Thomas", "Carlyle", 53), new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39));

		// Step 1: Sort list by last name
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
//		sort(people);
		// Step 2: Create a method that prints all elements in the list
		people.forEach((p) -> System.out.println(p.toString()));
//		printAll(people);
		System.out.println();
		// Step 3: Create a method that prints all people that have last name
		// beginning with C
		people.forEach((p) -> { 
			if (p.getLastName().startsWith("C")){
			System.out.println(p.toString());
			}});
//		printPeopleWithC(people);
	}

	// Java 7
//	public static void sort(List<Person> people) {
//		Collections.sort(people);
//	}

	public static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}

	public static void printPeopleWithC(List<Person> people) {
		for (Person person : people) {
			if (person.getLastName().startsWith("C")) {
				System.out.println(person.toString());
			}
		}
	}
}
