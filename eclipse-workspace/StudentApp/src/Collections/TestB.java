package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestB {

	public static void main(String[] args) {

		LinkedList<Laptop> ll= new LinkedList<Laptop>();
		Laptop l1 = new Laptop(40000, 4, "HP");
		Laptop l2 = new Laptop(50000,5,"DELL");
		Laptop l3 = new Laptop(60000,8,"sony");
		
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		
		ll.add(new Laptop(90000, 16,"hp"));
		displayLaptopDetails(ll);
		
	}
	
	static void displayLaptopDetails(LinkedList<Laptop> ll)
	{
		Iterator<Laptop> it = ll.iterator();
		while(it.hasNext())
		{
			Laptop lp =it.next();
			System.out.println(" brand is "+lp.brand);
			System.out.println("price is "+lp.price);
			System.out.println("ram is "+lp.ram);
		}
		
		
	}

}
