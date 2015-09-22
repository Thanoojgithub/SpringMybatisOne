package com.springmybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.springmybatis.beans.Employee;

public interface EmployeeDao {
	
	Employee getEmployee (Integer eId);
	
	Employee getEmployeeByEid (Integer eId); 
	
	List<Employee> getEmployeeByName(String eName);
	
	void insertEmployee(Employee employee);
	
	List<Employee> getEmployees();
	
	boolean updateEmployee(@Param("employee") Employee employee);

	boolean deleteEmployee(Integer geteId);

}
