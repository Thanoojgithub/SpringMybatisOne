package com.springmybatis.typeHandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

@MappedJdbcTypes(value = { JdbcType.BIGINT, JdbcType.BOOLEAN, JdbcType.CHAR, JdbcType.DATE, JdbcType.DOUBLE,
		JdbcType.DOUBLE, JdbcType.FLOAT, JdbcType.INTEGER, JdbcType.VARCHAR, JdbcType.TIME, JdbcType.TIMESTAMP })
public class NonNullParameterTypeHandler<E extends Object> extends BaseTypeHandler<E> {

	@Override
	public E getNullableResult(ResultSet arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getNullableResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNonNullParameter(PreparedStatement arg0, int arg1, E arg2, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

}
