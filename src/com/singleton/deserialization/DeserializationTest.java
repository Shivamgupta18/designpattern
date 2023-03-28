package com.singleton.deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationTest {
	public static void main(String[] args) throws Exception {
		DeserializationSingleTon s = DeserializationSingleTon.getInstance();
		System.out.println(s.hashCode());

		DeserializationSingleTon s1 = DeserializationSingleTon.getInstance();
		System.out.println(s1.hashCode());

		DeserializationSingleTon s2 = DeserializationSingleTon.getInstance();
		System.out.println(s2.hashCode());
		// converting the object into series of byte and sending over network;==Seralization
//		FileOutputStream fstream=new FileOutputStream("C:/Users/shivam.g/Desktop/Shivam.txt");
//		ObjectOutputStream out=new ObjectOutputStream(fstream);
//		out.writeObject(s);
//		// Deserialization
//		FileInputStream f1=new FileInputStream("C:/Users/shivam.g/Desktop/Shivam.txt");
//		ObjectInputStream in=new ObjectInputStream(f1);
//		 DeserializationSingleTon s5=(DeserializationSingleTon) in.readObject();
//		System.out.println(s5.hashCode());
		
		
		
		
		
		
	}
}
