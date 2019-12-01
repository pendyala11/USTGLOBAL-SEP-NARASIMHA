package com.ustglobal.empapp;

public class MyIdThread  extends Thread{

	public static void main(String[] args) {
	
	System.out.println(" main  started ");
	System.out.println(Thread.currentThread().getId());
	
	MyIdThread m1 = new MyIdThread();
	System.out.println(" MyId THREAD "+m1.getId());
	m1.getId();
	Thread.currentThread().setPriority(16);
System.out.println(" main ended ");
	}
}
