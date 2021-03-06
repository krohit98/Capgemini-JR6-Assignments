package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${emp.id}")
	private int employeeId;
	
	@Value("${emp.name}")
	private String employeeName;
	
	@Value("${emp.salary}")
	private double salary;
	
	@Value("${emp.age}")
	private int age;
	
	@Autowired
	private SBUBean businessUnit;
	

	public Employee() {
		
	}
	
	
	public Employee(int employeeId, String employeeName, double salary, int age) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.age = age;
	}
	

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public SBUBean getSBUDetails() {
		return businessUnit;
	}

}
