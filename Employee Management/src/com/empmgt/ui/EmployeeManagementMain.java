package com.empmgt.ui;

import com.empmgt.entities.*;
import com.empmgt.exceptions.*;
import java.util.*;

public class EmployeeManagementMain {

	// private data member
	private Map<Integer, Employee> employees = new HashMap<>();

	// main function
	public static void main(String[] args) {

		EmployeeManagementMain program = new EmployeeManagementMain();
		program.run();
	}

	// run method
	public void run() {

		// try block
		try {

			// Creating objects of type Department
			Department department1 = new Department("0001", "Development");
			Department department2 = new Department("0002", "Testing");

			// Creating and putting objects of type Developer and Tester in employees
			// hashmap.
			addDeveloper(1, "Rohit", department1, "Java");
			addDeveloper(2, "Tanisha", department2, "Jenkins");
			addTester(3, "Arpit", department1, "Python");
			addTester(4, "Mohit", department2, "Docker");

			// Displaying details of each object
			DisplayAll();

			// Removing an Employee object(Tester or Developer) by id
			int deleteId = 2;
			removeEmployeeById(deleteId);
			System.out.println("\n############## After deletion ###############\n");
			DisplayAll(); //To verify if the selected object is deleted or not
						
			// Displaying details of an Employee object(Tester or Developer) by id
			int findId = -1;
			Employee employee = findEmployeeById(findId);
			showEmployeeDetails(employee);

		}
		// catch blocks
		catch (InvalidIdException e) {
			System.out.println(e.getMessage());
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Something is wrong");
		}
	}

	// used to add a new object of type Developer to the employees hashmap.
	public void addDeveloper(int id, String name, Department department, String language) {
		Developer developer = new Developer(id, name, department, language);
		employees.put(id, developer);
	}

	// used to add a new object of type Tester to the employees hashmap.
	public void addTester(int id, String name, Department department, String device) {
		Tester tester = new Tester(id, name, department, device);
		employees.put(id, tester);
	}

	// Method to validate if id is correct
	public void validate(int id) throws InvalidIdException, EmployeeNotFoundException {
		if (id < 0) {
			throw new InvalidIdException("Entered ID is invalid!!");
		}

		if (!employees.containsKey(id)) {
			throw new EmployeeNotFoundException("Employee not found for id: " + id);
		}
	}

	// method to display the details of each object inside the employees hashmap
	public void DisplayAll() {
		Collection<Employee> employeeList = employees.values(); // employeeList holds a collection of all the objects of
																// class Developer or Tester
																// stored in the employees hashmap.
		// iterating through the objects stored in employees hashmap
		for (Employee employee : employeeList) {

			// to check if the reference variable holds an object of type Developer of
			// Tester
			if (employee instanceof Developer) {
				Developer developer = (Developer) employee; // type casting done so that showDetails() can be called
															// with the proper type of reference variable as parameter
				showDetails(developer); // displaying details
			} else {
				Tester tester = (Tester) employee;
				showDetails(tester); // displaying details
			}
		}
	}

	// findEmployeeById method
	public Employee findEmployeeById(int id) throws InvalidIdException, EmployeeNotFoundException {

		validate(id);

		Employee employee = employees.get(id);
		return employee;
	}

	// removeEmployeeById method
	public void removeEmployeeById(int id) throws InvalidIdException, EmployeeNotFoundException {

		validate(id);
		employees.remove(id);
	}

	// Method to display details of objects of type Employee
	public void showEmployeeDetails(Employee employee) {
		System.out.println("Employee Name:" + employee.getName());
		System.out.println("Employee ID:" + employee.getId());
		System.out.println("Employee Department Name:" + employee.getDepartment().getDeptName());
		System.out.println("Employee Department Id:" + employee.getDepartment().getDeptId());
	}

	// Method to display details of objects of type Tester
	public void showDetails(Tester tester) {
		showEmployeeDetails(tester);
		System.out.println("Employee Language:" + tester.getTools());
		System.out.println("-----------------------------------------");
	}

	// Method to display details of objects of type Developer
	public void showDetails(Developer developer) {
		showEmployeeDetails(developer);
		System.out.println("Employee Language:" + developer.getLanguage());
		System.out.println("-----------------------------------------");
	}

}
