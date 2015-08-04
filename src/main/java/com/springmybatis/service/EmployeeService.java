package com.springmybatis.service;

import java.sql.SQLException;

import com.springmybatis.beans.Employee;

public interface EmployeeService {
	
	Employee getEmployee (Integer eId); 
	
	Employee getEmployeeDetails(int eId) throws SQLException;

}
