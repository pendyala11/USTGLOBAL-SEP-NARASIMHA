package com.ustglobal.thread.properties;

public class MyThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("main started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("current thread "+tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("my thread name "+mname);
		
		Thread.currentThread().setName("bala");
		
		t1.setName("golu");
		System.out.println("my thread name is "+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("main ended");
		
	}
}
