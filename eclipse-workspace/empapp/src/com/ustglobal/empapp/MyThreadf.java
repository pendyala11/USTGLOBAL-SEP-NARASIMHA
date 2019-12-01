package com.ustglobal.empapp;

public class MyThreadf {

	public static void main(String[] args) {
	
		System.out.println(" main started ");
       String tname = Thread.currentThread().getName();
       System.out.println(" current thread  "+tname);
       Thread.currentThread().setName("bala");
       MyThread t1 = new MyThread();
       String mname = t1.getName();
       System.out.println(" my thread name "+mname);
       t1.setName(" golu ");
       System.out.println(" my thread name "+t1.getName());
       
       
       
       System.out.println(10/0);
       System.out.println(" main ended ");
       
       
       
	}

}
