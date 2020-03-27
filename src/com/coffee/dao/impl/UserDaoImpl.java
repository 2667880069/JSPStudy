package com.coffee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.coffee.dao.UserDao;
import com.coffee.entity.user;
import com.sun.org.apache.regexp.internal.recompile;



public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection connection, user user) throws SQLException {
		PreparedStatement psStatement=connection.prepareStatement(
     "insert into tbl_user(name,password,email) values(?,?,?)");
		psStatement.setString(1, user.getName());//没有0
		psStatement.setString(2, user.getPassword());
		psStatement.setString(3, user.getEmail());
		psStatement.execute();
	}

	@Override
	public int update(Connection connection, Long id, user user) throws SQLException {
		PreparedStatement psStatement=connection.prepareStatement(
			     "update tbl_user set name=?,password=?,email=? where id=?");
					psStatement.setString(1, user.getName());//没有0
					psStatement.setString(2, user.getPassword());
					psStatement.setString(3, user.getEmail());
					psStatement.setLong(4, user.getId());
				return	psStatement.executeUpdate();
	}

	@Override
	public void delete(Connection connection, user user) throws SQLException{
		PreparedStatement psStatement=connection.prepareStatement(
			     "delete from tbl_user where id=?");
					psStatement.setLong(1, user.getId());
				psStatement.execute();
		
	}

	@Override
	public ResultSet get(Connection connection, user user)throws SQLException {
		String sqlString="select * from tbl_user where name=? and password=?";
		PreparedStatement ps=connection.prepareStatement(sqlString);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		return ps.executeQuery();
	}

	@Override
	public ResultSet get(Connection connection)throws SQLException {
		PreparedStatement ps=connection.prepareStatement("select * from tbl_user");
		return ps.executeQuery();
	}


}
