package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Testc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Pen> al = new ArrayList<Pen>();

Pen p = new Pen(20, "clasmate");
Pen p1 = new Pen(30,"cello");
Pen p3 = new Pen(40,"renolds");

SortByPrice s = new SortByPrice();
Collections.sort(al,s);

al.add(p);
al.add(p1);
al.add(p3);
displayPenDetails(al);
Collections.sort(al,c);

static void displayPenDetails(ArrayList<Pen> al)
{
	Iterator<Pen> it = al.iterator();
	while(it.hasNext()) {
		Pen pp = it.next();
		System.out.println(" name of pen",pp.brand);
		System.out.println(" price of pen ",pp.price);
		
		
	}
}

	}

}
