package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(23);
		al.add(5);
		al.add(4);
		al.add(12);
		al.add(24);
		
		
		List<Integer> a = al.stream().filter(i ->(i%2 == 0)).collect(Collectors.toList());
		
		 System.out.println(a);
		 
		 for(Integer i : a) {
			 System.out.println(i);
			 
		 }
		

	}
}
