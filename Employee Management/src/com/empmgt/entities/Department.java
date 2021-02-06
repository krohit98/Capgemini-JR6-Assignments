package com.empmgt.entities;

public class Department {

	// private member functions
	private String deptId;
	private String deptName;

	// constructor function
	public Department(String id, String name) {
		this.deptId = id;
		this.deptName = name;
	}

	// getter methods
	public String getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	// setter methods
	public void setDeptId(String id) {
		this.deptId = id;
	}

	public void setDeptName(String name) {
		this.deptName = name;
	}
}
