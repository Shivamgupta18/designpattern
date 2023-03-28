package com.singleton.reflection;

public class Reflection {

	static Reflection instance = null;

	private Reflection()  {
		System.out.println("HI ! private Constructor");
	}

	static Reflection getInstance() {
		if (instance == null) {
			instance = new Reflection();
		}
		return instance;
	}
}
