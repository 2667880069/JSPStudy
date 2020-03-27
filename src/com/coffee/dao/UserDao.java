package com.coffee.dao;
//Data Access Object
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.coffee.entity.user;

public interface UserDao {
 public void save(Connection connection,user user) throws SQLException;
 public int update(Connection connection,Long id,user user)throws SQLException;
 public void delete(Connection connection,user user)throws SQLException;
public ResultSet get(Connection connection,user user)throws SQLException;
public ResultSet get(Connection connection)throws SQLException; 
}
