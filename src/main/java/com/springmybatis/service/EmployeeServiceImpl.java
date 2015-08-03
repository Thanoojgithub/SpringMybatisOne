package com.springmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmybatis.beans.Employee;
import com.springmybatis.dao.EmployeeDao;

@Component
public class EmployeeServiceImpl implements EmployeeService	 {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee getEmployee(Integer eId) {
		Employee employee = null;
		employee = employeeDao.getEmployee(eId);
		return employee;
	}

}
