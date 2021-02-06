package com.empmgt.entities;

public class Employee {

	// private member functions
	private int id;
	private String name;
	private Department department;

	// constructor function
	public Employee(int id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	// getter methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	// setter methods
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
