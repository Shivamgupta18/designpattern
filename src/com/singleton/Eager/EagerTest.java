package com.singleton.Eager;

public class EagerTest {
	public static void main(String[] args) {
		EagerInitialization s = EagerInitialization.getInstance();

		System.out.println(s.hashCode());

		EagerInitialization s1 = EagerInitialization.getInstance();
		System.out.println(s1.hashCode());

		EagerInitialization s2 = EagerInitialization.getInstance();
		System.out.println(s2.hashCode());
	}
}
