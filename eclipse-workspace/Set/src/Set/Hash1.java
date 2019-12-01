package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash1 {

	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();
		h1.add("ajay");
		h1.add("sujay");
		h1.add("dheeraj");
	
		
		
		Iterator  it = h1.iterator();
		while(it.hasNext()) {
			Object ob = it.next();
			System.out.println(ob);
		}
		

	}

}
