package com.springmybatis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

	public Employee getEmployee(Integer eId) {
		Employee employee = null;
		employee = getMapperFromSQLSession().getEmployee(eId);
		return employee;
	}

	private EmployeeMapper getMapperFromSQLSession() {
		return getSqlSession().getMapper(EmployeeMapper.class);
	}

	public void getEmployee(int eId, ResultSet[] rs) throws SQLException {
		Connection connection = sqlSession.getConnection();
		PreparedStatement prepareStatement = connection
				.prepareStatement("select * from mydb.employee e where e.eid = ?");
		prepareStatement.setInt(1, eId);
		rs[0] = prepareStatement.executeQuery();
	}

	public Employee getEmployeeDetails(int eId) throws SQLException {
		Employee employee = null;
		employee = getMapperFromSQLSession().getEmployeeDetails(eId);
		return employee;
	}

	/*
	 * CALL getEmployee (6)
	 * 
	 * DELIMITER $$ CREATE PROCEDURE getEmployee (IN user_id BIGINT)
	 * BEGIN
	 * SELECT * FROM mydb.user u WHERE u.user_id = user_id;
	 * END $$
	 * 
	 * DROP PROCEDURE getEmployee;
	 */

}
