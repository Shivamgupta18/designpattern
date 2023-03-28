package com.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class ReflectionTest {

	public static void main(String[] args)
			throws NoSuchMethodException, SecurityException, InstantiationException, Exception, Exception, Exception {

		Reflection s = Reflection.getInstance();
		System.out.println(s.hashCode());

		Reflection s2 = Reflection.getInstance();
		System.out.println(s2.hashCode());
		Reflection s1 = Reflection.getInstance();
		System.out.println(s1.hashCode());
		// Reflection Api calling private constructor
		Reflection s3 = null;
		Constructor<?>[] constructors = Reflection.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			Object obj = constructor.newInstance();
			s3 = (Reflection) obj;
			break;
		}
		
		System.out.println(s3.hashCode());
	}
}
