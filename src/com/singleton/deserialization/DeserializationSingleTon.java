package com.singleton.deserialization;

import java.io.Serializable;

public class DeserializationSingleTon  extends Thread implements Serializable, Cloneable{
	/**
	 * 
	 */
	
	public static void main(String[] args) {
		DeserializationSingleTon t1=new DeserializationSingleTon();
		t1.start();
		DeserializationSingleTon t2=new DeserializationSingleTon();
		t2.start();
	}
	private static final long serialVersionUID = 1L;
	String s1 = "shivam";
	// creating a object at class level is known as eager inilization
	// class loader
	static DeserializationSingleTon instance = null;

	private DeserializationSingleTon()  {
		// TODO Auto-generated constructor stub
		
	}

	static DeserializationSingleTon getInstance() {
		if (instance == null) {
			instance = new DeserializationSingleTon();
		}
		return instance;
	}

//	Object readResolve() {
//		return s;
//	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		DeserializationSingleTon s7=DeserializationSingleTon.getInstance();
		System.out.println(s7.hashCode());
	}
 
	void m1() {
		System.out.println("Hello SingleTon class");
	}
}
