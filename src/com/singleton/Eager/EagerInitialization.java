package com.singleton.Eager;

public class EagerInitialization {
	//creating a object at class level is known as eager inilization
	//class loader
	static EagerInitialization instance = new EagerInitialization();
	
	private EagerInitialization() {
		// TODO Auto-generated constructor stub
	}

	static EagerInitialization getInstance() {
		return instance;
	}

	void m1() {
		System.out.println("Hello SingleTon class");
	}
}
