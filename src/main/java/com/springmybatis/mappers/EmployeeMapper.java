package com.springmybatis.mappers;

import java.sql.SQLException;

import com.springmybatis.beans.Employee;

public interface EmployeeMapper {

	Employee getEmployee(Integer eId);
	
	Employee getEmployeeDetails(int eId) throws SQLException;

}
