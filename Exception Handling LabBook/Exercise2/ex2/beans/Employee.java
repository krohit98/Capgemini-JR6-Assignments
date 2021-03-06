package ex2.beans;

import java.util.List;

public class Employee {

	private String fullName;
	private int id;
	
	public Employee(String name, int id) {
		this.fullName = name;
		this.id=id;
	}
	
	public String getName() {
		return fullName;
	}
	
	public void setName(String name) {
		this.fullName = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return("name: "+fullName+" id: "+id);
	}
}
 