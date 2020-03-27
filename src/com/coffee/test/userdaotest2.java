package com.coffee.test;



import com.coffee.DB.DB;
import com.coffee.entity.user;
import com.coffee.mysql.util.SqlWhere;

public class userdaotest2 {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		 SqlWhere where=new SqlWhere();
	        where.add2("name","刘伟").add2("password", "111");
	        String s="select * from tbl_user";
	        s=s+where;
	        System.out.println(s);
	       user pojo= (user) DB.get(s,user.class);
	       System.out.println(pojo.getId()+pojo.getName()+pojo.getPassword()+pojo.getEmail());

	}

}
