package com.coffee.jdbc;

import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;


import com.mysql.jdbc.Connection;

public class transaction {
	 public static Connection getConnection() {
		  Connection connection=null;
		  
		
		  try {
				Class.forName("com.mysql.jdbc.Driver");
				connection=  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db"
						,"root","111111");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	          catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
	      return connection;
		}  
	 
	 public static void insertUser(Connection connection) throws SQLException {
			//Connection connection=getConnection();
			String sql="insert into tbl_user(id,name,password,email)"+
			" values(50,'liuwei9999','999','liuwei999@qq.com')";
			Statement statement=connection.createStatement();
		        int count;
				count = statement.executeUpdate(sql);
				System.out.println("insert:"+count);
		  }
	 public static void insertAddress(Connection connection) throws SQLException {
			//Connection connection=getConnection();
			String sql="insert into tbl_address(id,city,country,user_id)"+
			" values(1,'liuwei','111',50)";
		    Statement statement=connection.createStatement();
		        int count;
				count = statement.executeUpdate(sql);
				System.out.println("insert:"+count);
		  }
	 public static void main(String[] args) {
		Connection connection=null;
		connection=getConnection();
		try {
			connection.setAutoCommit(false);//1
			insertUser(connection);
			insertAddress(connection);
			connection.commit();//2
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();//3
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
