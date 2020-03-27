package com.coffee.model;

public class Singleton2 {
	 private static Singleton2 instance;
	  private Singleton2(){}
	  public static synchronized Singleton2 getinstance(){
		   if(instance==null){
			   instance=new Singleton2();
		   }
		  return instance;
	  }
}
