package com.ustglobal.empapp;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my);
		t1.start();
	}

}
