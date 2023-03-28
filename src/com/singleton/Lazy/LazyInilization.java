package com.singleton.Lazy;

public final class LazyInilization {
	static LazyInilization instance = null;
	private LazyInilization() {

	}
// why we are using static == getInstance method ko call krne ke liye object chahiye
	// aur outside class me access ke liye
	static LazyInilization getInstance() {
		if (instance == null) {
			instance = new LazyInilization();
		}
		return instance;
	}

	void m1() {
		System.out.println("THis is my Instance");
	}
}
// we are making final here kyu ki lazy l=new LazyTest();
// krke vha new object bna skte h 