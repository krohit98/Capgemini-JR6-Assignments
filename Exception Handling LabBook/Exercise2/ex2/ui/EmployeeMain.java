package ex2.ui;

import ex2.beans.*;
import ex2.exceptions.*;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args){
		
		EmployeeMain app = new EmployeeMain();
		app.start();
	}
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String fullName = sc.nextLine();
		System.out.println("Enter id:");
		int id = sc.nextInt();
		Employee employee = new Employee(fullName, id);
		String array[] = employee.getName().split(" ");
		try {
		validate(array);
		}catch(InvalidNameException e) {
			System.out.println(e);
		}
		sc.close();
	}
	
	public void validate(String[] array) throws InvalidNameException{
		if(array[0].isEmpty()) {
			throw new InvalidNameException("First Name cannot be blank");
		}
		else if(array.length<2 && array.length>0) {
			throw new InvalidNameException("Last Name cannot be blank");
		}
		else {
			System.out.println(array[0]+" "+array[1]);
		}
	}
}
