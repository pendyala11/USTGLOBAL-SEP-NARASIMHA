package Pract;

import java.util.Comparator;

public class SortByIdCars implements Comparator<Cars>{

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
