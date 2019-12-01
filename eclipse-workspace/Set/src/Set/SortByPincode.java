package Set;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank> {

	@Override
	public int compare(Bank a1, Bank a2) {
		// TODO Auto-generated method stub
		Integer i = a1.pincode;
		Integer j = a2.pincode;
		
		return i.compareTo(j);
	}

}
