package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortByPincode sp = new SortByPincode();
		
TreeSet<Bank> ts = new TreeSet<Bank>(sp);
Bank b1 = new Bank("HDFC",560068,676868);
Bank b2 = new Bank("SBI",560071,676889);
Bank b3 = new Bank("citi",787890,67867890);
ts.add(b1);
ts.add(b2);
ts.add(b3);
System.out.println("************* using iterator****");
Iterator<Bank> it = ts.iterator();
while(it.hasNext())
{
	Bank b = it.next();
	System.out.println("name is "+b.name);
	System.out.println("pincode is"+b.pincode);
	System.out.println("micr is "+b.micr);
}
	}

}
