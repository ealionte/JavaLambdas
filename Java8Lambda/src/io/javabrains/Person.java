package io.javabrains;

import java.util.Comparator;

public class Person{ 
//implements Comparable<Person>{
	private String lastName;
	private String firstName;
	private int age;
	
	
	
	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Person [firstName = " + this.firstName + ", lastName = " + this.lastName + ", age = " + age;
		
	}
//
//	@Override
//	public int compareTo(Person arg0) {
//		return this.getLastName().compareTo(arg0.getLastName());
//	}
}
