package com.UstGlobal.StudentApp.TypeCasting;

public class Typecasting {
    public static void main(String[] args) {
		byte a=10;
		int b=a;
		System.out.println(" b is  " +b);
		int p=20;
		double q=p;
		System.out.println(" q is  "+q);
		double x=20.34;
		int y= (int) x;
		System.out.println(" y is  "+y);
		
		byte c = (byte) y;
		System.out.println(" c is "+ c);
		char d=(char) y;
		System.out.println(" d is "+ d);
	}
}
