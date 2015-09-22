package com.springmybatis.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.springmybatis.beans.Employee;

public interface EmployeeMapper {

	Employee getEmployee(@Param("eId") Integer eId);
	
	List<Employee> getEmployeeByName(@Param("eName") String eName);
	
	void insertEmployee(@Param("employee") Employee employee);
	
	List<Employee> getEmployees();
	
	boolean updateEmployee(@Param("employee") Employee employee);

	boolean deleteEmployee(@Param("eId") Integer eId);
	
	@Select("select * from MYDB.EMPLOYEE e where e.eid = #{eId}")
	Employee getEmployeeByEid(@Param("eId") Integer eId);
	
	@Insert("INSERT INTO MYDB.EMPLOYEE (ENAME) VALUES (#{employee.eName})")
	@SelectKey(statement="call identity()", keyProperty="eId", before=false, resultType=int.class)
	int insertEmployeeUsingIentity(@Param("employee") Employee employee);

}
