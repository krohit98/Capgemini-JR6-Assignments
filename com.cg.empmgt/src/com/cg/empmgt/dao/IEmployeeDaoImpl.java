package com.cg.empmgt.dao;

import com.cg.empmgt.beans.Employee;
import java.util.*;
import com.cg.empmgt.exceptions.*;

public class IEmployeeDaoImpl implements IEmployeeDao {

	private Map<Integer, Employee> store=new HashMap<>();
	private int ID=0;
	
	public int generateId() {
		ID++;
		return ID;
	}
	
	public void validateId(int id) {
		if(id<0) {
			throw new InvalidIdException("Id cannot be negative");
		}
	}
	
	public void add(Employee employee) {
		int id=generateId();
		store.put(id, employee);
	}
	
	public Employee findById(int id) {
		validateId(id);
		Employee employee = store.get(id);
		return employee;
	}
	
	public void removeById(int id) {
		store.remove(id);
	}
	
	public List<Employee> findAll(){
		List<Employee> employees=new ArrayList<>(store.values());
		return employees;
	}
}
