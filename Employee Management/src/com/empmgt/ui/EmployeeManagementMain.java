package com.empmgt.ui;

import com.empmgt.entities.*;

public class EmployeeManagementMain {

	public static void main(String[] args) {

		EmployeeManagementMain program = new EmployeeManagementMain();
		program.run();
	}

	public void run() {
		// Creating objects
		Department department1 = new Department("0001", "Development");
		Department department2 = new Department("0002", "Testing");

		Developer employee1 = new Developer(1, "Rohit", department1, "Java");
		Developer employee2 = new Developer(2, "Tanisha", department2, "Jenkins");
		Tester employee3 = new Tester(3, "Arpit", department1, "Python");
		Tester employee4 = new Tester(4, "Mohit", department2, "Docker");

		// Object array
		Employee employees[] = { employee1, employee2, employee3, employee4 };

		// Iterating through the object array
		for (int i = 0; i < employees.length; i++) {
			// to check if the reference variable present as element in the object array
			// holds an object of type Developer or type Tester
			if (employees[i] instanceof Developer) {
				Developer developer = (Developer) employees[i]; // A reference variable of type Developer is created
				showDetails(developer); 						// and it holds another reference variable of type Employee, thus it
			} 													// is type casted to show that it holds an object of type Developer.
			else {
				Tester tester = (Tester) employees[i]; // A reference variable of type Developer is created
			     showDetails(tester);                  // and it holds another reference variable of type Employee, thus it
			}										   // is type casted to show that it holds an object of type Developer.
		}
	}
	//Method to display details of objects of type Employee
	public void showEmployeeDetails(Employee employee) {
		System.out.println("Employee Name:" + employee.getName());
		System.out.println("Employee ID:" + employee.getId());
		System.out.println("Employee Department Name:" + employee.getDepartment().getDeptName());
		System.out.println("Employee Department Id:" + employee.getDepartment().getDeptId());
	}
	//Method to display details of objects of type Tester
	public void showDetails(Tester tester) {
		showEmployeeDetails(tester);
		System.out.println("Employee Language:" + tester.getTools());
		System.out.println("-----------------------------------------");
	}
	//Method to display details of objects of type Developer
	public void showDetails(Developer developer) {
		showEmployeeDetails(developer);
		System.out.println("Employee Language:" + developer.getLanguage());
		System.out.println("-----------------------------------------");
	}

}										  
				
			
