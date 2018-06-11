package com.jeffreyahn.web.models;

public class Player {
	private String firstName;
	private String lastName;
	private int age;
//constructor
	public Player(String firstName, String lastName, int  age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}
//getters and setters
	public String getFirstName() {
		return firstName;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
}
