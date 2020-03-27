package com.coffee.model;

public class Singletondemo {
public static void main(String[] args) {
	//SingleObject object=new SingleObject();
	SingleObject object=SingleObject.getInstance();
	object.show();
}
}
