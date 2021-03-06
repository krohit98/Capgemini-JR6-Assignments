package com.cg.eis.ui;

import java.util.*;
import com.cg.eis.beans.*;
import com.cg.eis.exception.*;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeMain app = new EmployeeMain();
		app.start();
	}
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Employee Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Salary: ");
		float salary=sc.nextFloat();
		Employee employee=new Employee(id, name, salary);
		try {
		validate(employee.getSalary());
		}catch(EmployeeException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Employee id: "+employee.getId());
			System.out.println("Employee Name: "+employee.getName());
		}
	}
	
	public void validate(float salary ) {
		if(salary<3000) {
			throw new EmployeeException("Salary below 3000!!!");
		}
		else {
			System.out.println("Salary is "+salary+" for this employee");
		}
	}
}
