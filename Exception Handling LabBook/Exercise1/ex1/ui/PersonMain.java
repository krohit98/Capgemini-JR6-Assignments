package ex1.ui;

import ex1.beans.*;
import ex1.exceptions.*;
import java.util.*;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonMain app = new PersonMain();
		app.start();
	}
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.next();
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		Person person = new Person(name,age);
		try {
		validate(person.getAge());
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}
		sc.close();
		
	}
	
	public void validate(int age) {
		if(age<=15) {
			throw new InvalidAgeException("Age cannot be less than 15");
		}
		else
		{
			System.out.println("Age has been verified");
		}
	}

}
