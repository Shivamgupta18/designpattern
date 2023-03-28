package com.singleton.Thread;

public class SingleTon extends Thread {
	static SingleTon  instance=null;
     private SingleTon(){
	  
  }
	   static SingleTon getInstance() {
		  System.out.println("Hii");
		  System.out.println("Hi..");
		  
		if(instance==null) {
			synchronized (SingleTon.class) {
				if(instance==null) {
				instance=new SingleTon();
				}
			}
		}
		return instance;
	}
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
	SingleTon single=SingleTon.getInstance();
   System.out.println(single.hashCode());
	}
	
	public static void main(String[] args) {
		SingleTon t1=new SingleTon();
		t1.start();
		SingleTon t2=new SingleTon();
		t2.start();
	}
}
