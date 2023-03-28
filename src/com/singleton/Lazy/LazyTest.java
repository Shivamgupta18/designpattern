package com.singleton.Lazy;

public class LazyTest {
	public static void main(String[] args) {
       LazyInilization s=LazyInilization.getInstance();
       System.out.println(s.hashCode());
       
       LazyInilization s1=LazyInilization.getInstance();
       System.out.println(s1.hashCode());
       
       LazyInilization s2=LazyInilization.getInstance();
       System.out.println(s2.hashCode());
	}
}
