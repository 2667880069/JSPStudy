package com.coffee.jdbc;



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class jdbctest {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	ResultSet rsResultSet=null;
	String sql="select * from tbl_user";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");//1加载驱动
		try {
			connection=  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db"
					,"root","111111");//2打开链接
			statement= (Statement) connection.createStatement();//3
			rsResultSet=statement.executeQuery(sql);//3执行
			
			while (rsResultSet.next()) {
				System.out.println(rsResultSet.getInt("id")+" ");
				System.out.println(rsResultSet.getString("name")+" ");
				System.out.println(rsResultSet.getString("password")+" ");
				System.out.println(rsResultSet.getString("email")+" ");
			}//4处理结果
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		  try {
			rsResultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//5清理环境
	
}
}
