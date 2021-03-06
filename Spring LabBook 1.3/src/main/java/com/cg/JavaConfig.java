package com.cg;

import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("{classpath:employee1.properties, classpath:employee2.properties}")
@ComponentScan("com.cg")
public class JavaConfig {

	@Bean
	public List<Employee> empList(Employee employee1, Employee employee2){
		return Arrays.asList(employee1,employee2);
	}
}
