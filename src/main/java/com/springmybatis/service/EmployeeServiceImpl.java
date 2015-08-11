package com.springmybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmybatis.beans.Employee;
import com.springmybatis.dao.EmployeeDao;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService	 {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee getEmployee(Integer eId) {
		return employeeDao.getEmployee(eId);
	}

	@Override
	public List<Employee> getEmployeeByName(String eName) {
		return employeeDao.getEmployeeByName(eName);
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(Integer geteId) {
		return employeeDao.deleteEmployee(geteId);
		
	}
	
}
