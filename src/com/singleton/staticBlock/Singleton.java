package com.singleton.staticBlock;

public class Singleton {

	static Singleton instance = null;
	static {
		try {
			instance = new Singleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	private Singleton() {

	}
}
