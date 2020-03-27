package com.coffee.test;

import java.sql.Connection;

import com.coffee.util.ConnectionFactory;

public class ConnectionFactorytest {
 public static void main(String[] args) {
	ConnectionFactory cFactory=ConnectionFactory.getInstance();
	Connection connection=cFactory.makeConnection();
	try {
		System.out.println(connection.getAutoCommit());
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
}
