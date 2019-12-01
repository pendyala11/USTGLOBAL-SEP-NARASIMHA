package com.UstGlobal.Strings;

public class Testb {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		String[] names = {"narasimha"."like","biscuts"};
		System.out.println(a[3]);
		receive(a);
		bob(names);
	}
	
	static void receive(int[] a) {
		for(int ar:a) {
			System.out.println(ar);
		}
		
		static String bob(String[] names)
		{
			for(String b : names)
			{
				System.out.println(b);
			}
		}
	}

}
