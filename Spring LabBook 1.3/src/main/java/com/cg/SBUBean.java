package com.cg;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBUBean {
	
	@Value("${sbu.id}")
	private int sbuId;
	@Value("${sbu.name}")
	private String sbuName;
	@Value("${sbu.head}")
	private String sbuHead;
	
	@Autowired
	private List<Employee> empList;
	
	public int getSbuId() {
		return sbuId;
	}
	
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	
	public String getSbuName() {
		return sbuName;
	}
	
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	public String getSbuHead() {
		return sbuHead;
	}
	
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public List<Employee> getEmpList() {
		return empList;
	}
	
	public void setEmpList(List<Employee> list) {
		this.empList = list;
	}
	

}