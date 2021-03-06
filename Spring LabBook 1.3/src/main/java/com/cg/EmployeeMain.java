package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	    public static void main(String args[]){
	        
	    	EmployeeMain app = new EmployeeMain();
	    	app.start();
	    }
	    
	    public void start() {
	    	
	    	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
	        context.register(JavaConfig.class);
	        context.refresh();
	        Employee employee= context.getBean(Employee.class);
	        System.out.println("Employee details"
	        		+"\n-----------------------"
	        		+"\nEmployee ID: "+employee.getEmployeeId()
	        		+"\nEmployee Name: "+employee.getEmployeeName()
	        		+"\nEmployee Salary: "+employee.getSalary()
	        		+"\nAge: "+employee.getAge()
	        		+"\nSbuID: "+employee.getSBUDetails().getSbuName()
					+"\nSbuName: "+employee.getSBUDetails().getSbuId()
					+"\nSbuHead: "+employee.getSBUDetails().getSbuHead()
					);
	        context.close();
	    }

	}

