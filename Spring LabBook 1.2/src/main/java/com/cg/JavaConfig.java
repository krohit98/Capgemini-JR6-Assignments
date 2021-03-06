package com.cg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:employee.properties")
@ComponentScan("com.cg")
public class JavaConfig {

}
