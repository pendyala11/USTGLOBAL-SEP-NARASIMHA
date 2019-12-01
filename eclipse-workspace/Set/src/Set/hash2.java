package Set;

import java.util.LinkedHashSet;

public class hash2 {

	public static void main(String[] args) {
	LinkedHashSet<Double> ls = new LinkedHashSet();
	ls.add(12.3);
	ls.add(34.34);
	ls.add(34.8);
	ls.add(null);
	ls.add(null);
	
	for (Double s : ls) {
		System.out.println(s);
	}
	
	}

}
