package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("jaya");
		ts.add("munni");
		ts.add("sheeta");
		
		for (String st : ts) {
			System.out.println(st);
		}
		
		System.out.println("*************************************");
		Iterator<String> it =ts.iterator();
		while(it.hasNext())
		{
			String p =  it.next();
			System.out.println(p);
		}

	}

}
