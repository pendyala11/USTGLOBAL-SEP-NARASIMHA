package com.ustglobal.empapp;

public class Thread1 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.run();
		t1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println(" main thread");
		}
System.out.println(" main ended ");
	}

}
