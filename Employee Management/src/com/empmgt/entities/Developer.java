package com.empmgt.entities;

public class Developer extends Employee {

	// private data member of derived class
	private String language;

	// constructor function of derived class
	public Developer(int id, String name, Department department, String language) {

		super(id, name, department);// invoking the base class constructor using keyword super
		this.language = language;
	}

	// getter method
	public String getLanguage() {
		return language;
	}

	// setter method
	public void setLanguage(String language) {
		this.language = language;
	}

}
