package com.springmybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.springmybatis.beans.Employee;
import com.springmybatis.mappers.EmployeeMapper;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	private SqlSession sqlSession;

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public Employee getEmployee(Integer eId) {
		Employee employee = null;
		employee = getMapperFromSQLSession().getEmployee(eId);
		return employee;
	}

	private EmployeeMapper getMapperFromSQLSession() {
		return getSqlSession().getMapper(EmployeeMapper.class);
	}

}
