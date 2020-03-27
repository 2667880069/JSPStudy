package com.coffee.model;
//饿汉模式
public class SingleObject {
  private SingleObject(){}
  private static SingleObject instance=new SingleObject();
  
  public static SingleObject getInstance(){
	  return instance;
  }
  public void show() {
	System.out.println("single instance");
}
}
