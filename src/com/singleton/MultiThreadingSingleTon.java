package com.singleton;

public class MultiThreadingSingleTon implements Runnable {

	static MultiThreadingSingleTon instance=null;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Multi Threading ");
	}
	
	 static MultiThreadingSingleTon getInstance() {
		if(instance==null) {
			instance=new MultiThreadingSingleTon();
		}
		return instance;
	}

}
