package com.singleton.enumsingleton;

public class MainEnumTest {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.GETINSTANCE;
		Singleton singleton2 = Singleton.GETINSTANCE;
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

		String st = singleton1.welcome();
		System.out.println(st);
	}
}
