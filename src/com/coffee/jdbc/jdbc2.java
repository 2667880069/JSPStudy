package com.coffee.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.sun.org.apache.bcel.internal.generic.LLOAD;

public class jdbc2 {
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
  public static void insert() {
	Connection connection=getConnection();
	String sql="insert into tbl_user(name,password,email) values('liuwei','111','liuwei@qq.com')";
    java.sql.Statement statement=null;
    try {
		statement=connection.createStatement();
        int count;
		count = statement.executeUpdate(sql);
		System.out.println("insert:"+count);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}  
  }
  public static void delete() {
		Connection connection=getConnection();
		String sql="delete from tbl_user where name='liuwei'";
	    java.sql.Statement statement=null;
	    try {
			statement=connection.createStatement();
	        int count;
			count = statement.executeUpdate(sql);
			System.out.println("delete:"+count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}  
	  }
  
  public static void update() {
		Connection connection=getConnection();
		String sql="update tbl_user set email='hahaha@qq.com' where name='liuwei'";
	    java.sql.Statement statement=null;
	  
			try {
				statement=connection.createStatement();
				int count;
				count = statement.executeUpdate(sql);
				System.out.println("update:"+count);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}					  
	  }
  public  void haha() throws IOException {
	  Properties properties=new Properties();
	  
	  InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("dbconfig.properties");
	properties.load(inputStream);
	  System.out.println(properties.getProperty("dburl"));
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    // insert();insert();
    // delete();
    // update();
		jdbc2 jd=new jdbc2();
		jd.haha();
	}

}
