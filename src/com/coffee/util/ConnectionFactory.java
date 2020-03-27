package com.coffee.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class ConnectionFactory {
 private static  String driver;
 private static String dburl;
 private static String user;
 private static String password;
 private static ConnectionFactory FACTORY=new ConnectionFactory();
 private Connection connection;
 static{
	  Properties properties=new Properties();
	 InputStream inputStream=ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
	 try {
		properties.load(inputStream);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("properties error");
		e.printStackTrace();
	}
	 driver=properties.getProperty("driver"); 
	 dburl=properties.getProperty("dburl"); 
	 user=properties.getProperty("user"); 
	 password=properties.getProperty("password"); 
 }
private ConnectionFactory(){
	
}
public static ConnectionFactory getInstance(){
	return FACTORY;
}
public  Connection makeConnection() {
	try {
		Class.forName(driver);
		connection=   DriverManager.getConnection(dburl,user,password);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
}
}
