package com.cg;

import com.cg.service.IEmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjectMain {

    public static void main(String args[]){
        ConfigurableApplicationContext context =SpringApplication.run(ProjectMain.class, args);
        IEmployeeService service= context.getBean(IEmployeeService.class);


    }

}
