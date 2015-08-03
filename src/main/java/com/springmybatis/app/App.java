package com.springmybatis.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmybatis.service.EmployeeService;

public class App {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")){
			EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
			System.out.println(employeeService.getEmployee(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
