package Set;

import java.util.Hashtable;

public class TestP {

	public static void main(String[] args) {
	Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
	ht.put(101,"ajay");
	ht.put(102, "vijay");
	ht.put(103, "sonu");
	ht.put(104, "rani");
	ht.put(101, "vijay");
	ht.put(105, "mani");
	System.out.println("data "+ht);
	}

}
