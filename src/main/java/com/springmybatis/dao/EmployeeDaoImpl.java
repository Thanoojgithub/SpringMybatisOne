package com.springmybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.springmybatis.beans.Employee;
import com.springmybatis.mappers.EmployeeMapper;

@Component("EmployeeDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao {

	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	private EmployeeMapper getMapperFromSQLSession() {
		return getSqlSession().getMapper(EmployeeMapper.class);
	}

	@Override
	public Employee getEmployee(Integer eId) {
		Employee employee = this.sqlSession.selectOne("com.springmybatis.mappers.EmployeeMapper.getEmployee", 1);
		System.out.println("EmployeeDaoImpl.getEmployee() :: " + employee);
		return getMapperFromSQLSession().getEmployee(eId);
	}

	@Override
	public List<Employee> getEmployeeByName(String eName) {
		return getMapperFromSQLSession().getEmployeeByName(eName);
	}

	@Override
	public void insertEmployee(Employee employee) {
		//getMapperFromSQLSession().insertEmployeeUsingIentity(employee);
		getMapperFromSQLSession().insertEmployee(employee);	
	}

	@Override
	public List<Employee> getEmployees() {
		return getMapperFromSQLSession().getEmployees();
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return getMapperFromSQLSession().updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(Integer geteId) {
		return getMapperFromSQLSession().deleteEmployee(geteId);
		
	}

	@Override
	public Employee getEmployeeByEid(Integer eId) {
		return getMapperFromSQLSession().getEmployeeByEid(eId);
	}

	/*
	 * CALL getEmployeeByName ("seeta")
	 * 
	 * DELIMITER $$ 
	 * CREATE PROCEDURE getEmployeeByName (IN eName VARCHAR(30))
	 * BEGIN 
	 * 		SELECT * FROM mydb.employee e WHERE e.eName = eName;
	 * END $$
	 * 
	 * DROP PROCEDURE getEmployee;
	 */

}
