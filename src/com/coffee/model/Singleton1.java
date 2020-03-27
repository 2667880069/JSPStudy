package com.coffee.model;
//懒汉模式
public class Singleton1 {
  private static Singleton1 instance;
  private Singleton1(){}
  public static Singleton1 getinstance(){
	   if(instance==null){
		   instance=new Singleton1();
	   }
	  return instance;
  }
}
