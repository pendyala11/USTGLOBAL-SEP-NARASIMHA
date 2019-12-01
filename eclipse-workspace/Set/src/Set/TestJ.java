package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
        Customer c = new Customer();
		TreeSet<Customer> ts =TreeSet<Customer>();
		Customer c1 = new Customer("narasimha", 12, 250000);
		Customer c2 = new Customer("hari",23,50000);
		Customer  c3 = new Customer("kunal",34,60000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		System.out.println("**** using iterator****");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext())
		{
			Customer c = it.next();
			System.out.println("name is "+c.name);
			System.out.println("pincode is"+c.id);
			System.out.println("micr is "+c.salary);
		}

	}

}
