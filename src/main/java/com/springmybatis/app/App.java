package com.springmybatis.app;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmybatis.beans.Employee;
import com.springmybatis.service.EmployeeService;

public class App {

	public static void main(String[] args) {

		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml")){
			EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
			// SELET - SINGLE ROW AS RESULTSET
			Employee employeeById = employeeService.getEmployee(1);
			System.out.println(employeeById);
			
			employeeById = employeeService.getEmployeeByEid(1);
			System.out.println("employeeService.getEmployeeByEid :: " + employeeById);
			
			// INSERT - ID AUTO_INCREMENT
			Employee insertEmployee = new Employee();
			insertEmployee.seteName("krishna");
			employeeService.insertEmployee(insertEmployee);

			// CALLABLE SP - LIST OR SINGLE ROW(S) AS RESULTSET & UPDATE
			List<Employee> employeeByName = employeeService.getEmployeeByName("krishna");
			for (Employee emp : employeeByName) {
				emp.seteName("krishna_updated");
				System.out.println("update :: "+employeeService.updateEmployee(emp));
			}
			
			// INSERT A DUMMY EMPLOYEE ROW  & DELETE
			Employee insertADummyEmployee = new Employee();
			insertADummyEmployee.seteName("krishna_updated");
			employeeService.insertEmployee(insertADummyEmployee);
			employeeByName = employeeService.getEmployeeByName("krishna_updated");
			for (Employee emp : employeeByName) {
				System.out.println("delete :: "+employeeService.deleteEmployee(emp.geteId()));
			}
			
			// LIST OR SINGLE ROW(S) AS RESULTSET
			List<Employee> employees = employeeService.getEmployees();
			for (Employee emp : employees) {
				System.out.println(emp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
 * 
Employee [eId=1, eName=ram]
update :: true
delete :: true
delete :: true
Employee [eId=1, eName=ram]
Employee [eId=2, eName=seeta]
Employee [eId=3, eName=lakshman]
Employee [eId=4, eName=hanuma]
Employee [eId=5, eName=bharatha]
Employee [eId=6, eName=setrughna]
 */
