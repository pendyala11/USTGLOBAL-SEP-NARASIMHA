package com.ustglobal.empapp;

public class MyThreadPriority extends Thread{

	public static void main(String[] args) {
		System.out.println(" main started ");
		int a =  Thread.currentThread().getPriority();
		System.out.println(" main thread priyority "+a);
		Thread.currentThread().setPriority(7);
		MyThreadPriority t = new MyThreadPriority();
		int b = t.getPriority();
		System.out.println(" mypriority thread priyority "+b);
		t.setPriority(6);
		System.out.println("main ended");
		
		

	}

}
