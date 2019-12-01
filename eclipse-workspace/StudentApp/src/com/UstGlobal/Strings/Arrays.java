package com.UstGlobal.Strings;

public class Arrays {

	public static void main(String[] args) {
		int[] nums = new int[5];
		
		nums[0]=10;
		nums[1]=10;
		nums[2]=10;
		nums[3]=10;
		nums[4]=10;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("==============================");
char[] ch = {'a','b','c','d'};
for(int c:ch) {
	System.out.println(c);
}

System.out.println("======================================");
boolean[] b = {true,false,true,false};
for (boolean c: b) {
	System.out.println(c);
}

byte[] f = {1,2,3,4};
for (byte g : f) {
	System.out.println(g);
	
}

String[] names = {"narsimha","kavya","divya"};
for (String string1 : names) {
	System.out.println(string1);
}
	}

}
