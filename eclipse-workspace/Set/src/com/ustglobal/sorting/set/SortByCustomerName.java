package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByCustomerName  implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name); 
	}

}
