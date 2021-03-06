package com.cg.empmgt.dao;

import com.cg.empmgt.beans.Employee;
import java.util.List;
import java.util.Map;

public interface IEmployeeDao {

	public void add(Employee employee);
	public Employee findById(int id);
	public void removeById(int id);
	public List<Employee> findAll();
}
