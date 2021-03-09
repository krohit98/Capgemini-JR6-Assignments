package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeMain app = new EmployeeMain();
		app.start(args);
	}
	
	public void start(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(EmployeeMain.class, args);
		Employee employee = context.getBean(Employee.class);
		System.out.println("Employee details"
        		+"\n-----------------------"
        		+"\nEmployee ID : "+employee.getEmployeeId()
        		+"\nEmployee Name : "+employee.getEmployeeName()
        		+"\nEmployee Salary : "+employee.getSalary()
        		+"\nEmployee BU :"+employee.getBusinessUnit()
        		+"\nAge : "+employee.getAge()
				);
		context.close();
	}
}
