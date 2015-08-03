package com.springmybatis.app;

import main.com.springmybatis.com.springmybatis.service.EmployeeService;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")) {
			EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
			System.out.println(employeeService.getEmployee(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
