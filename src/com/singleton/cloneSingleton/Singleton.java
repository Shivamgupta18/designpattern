package com.singleton.cloneSingleton;

public class Singleton implements Cloneable {
	static Singleton instance = null;

	static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}
 
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	private Singleton() {

	}
}
