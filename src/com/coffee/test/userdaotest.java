package com.coffee.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.coffee.dao.UserDao;
import com.coffee.dao.impl.UserDaoImpl;
import com.coffee.entity.user;
import com.coffee.util.ConnectionFactory;

public class userdaotest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection connection=null;
		connection=ConnectionFactory.getInstance().makeConnection();
		
		try {
			connection.setAutoCommit(false);
			UserDao userDao=new UserDaoImpl();
			user myUser=new user();
			myUser.setName("weiweiweiwei1");
			myUser.setPassword("11111");
			myUser.setEmail("ddk1j@qq.com");
			userDao.save(connection, myUser);
			connection.commit();
			
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
