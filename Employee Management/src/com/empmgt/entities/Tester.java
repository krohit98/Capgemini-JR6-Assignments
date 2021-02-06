package com.empmgt.entities;

public class Tester extends Employee {

	// private data member of derived class
	private String tools;

	// constructor function of derived class
	public Tester(int id, String name, Department department, String tools) {

		super(id, name, department);// invoking the base class constructor using keyword super
		this.tools = tools;
	}

	// getter method
	public String getTools() {
		return tools;
	}

	// setter method
	public void setTools(String tools) {
		this.tools = tools;
	}
}
