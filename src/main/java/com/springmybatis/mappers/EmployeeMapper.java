package com.springmybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.springmybatis.beans.Employee;

public interface EmployeeMapper {

	Employee getEmployee(@Param("eId") Integer eId);
	
	List<Employee> getEmployeeByName(@Param("eName") String eName);
	
	void insertEmployee(@Param("employee") Employee employee);
	
	List<Employee> getEmployees();
	
	boolean updateEmployee(@Param("employee") Employee employee);

	boolean deleteEmployee(@Param("eId") Integer eId);

}
