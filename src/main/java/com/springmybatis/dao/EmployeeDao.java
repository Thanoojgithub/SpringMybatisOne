package com.springmybatis.dao;

import java.sql.SQLException;

import com.springmybatis.beans.Employee;

public interface EmployeeDao {
	
	Employee getEmployee (Integer eId); 
	
	Employee getEmployeeDetails(int eId) throws SQLException;

}
