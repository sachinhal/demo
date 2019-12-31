package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import info.inet.model.Employee;

@SpringBootApplication
@ImportResource("${bean.config.dev}")
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		Employee bean = run.getBean(Employee.class);
		System.out.println(bean);
	}

}
