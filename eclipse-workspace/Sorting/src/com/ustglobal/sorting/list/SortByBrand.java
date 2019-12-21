package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByBrand implements Comparator<Pen> {

	@Override
	public int compare(Pen o1, Pen o2) {
		// TODO Auto-generated method stub
		
		String s = o1.brand;
		String t = o2.brand;
		
		return s.compareTo(t);
	}
	
	

}
