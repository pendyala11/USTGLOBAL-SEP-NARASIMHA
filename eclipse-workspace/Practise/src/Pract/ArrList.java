package Pract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String > cars = new ArrayList<String>();
		cars.add("nano");
		cars.add("baleno");
		cars.add("swift");
		cars.add("bmw");
		cars.add("bmw");
		cars.add("audi");
		cars.add("nano");
		cars.add("nano");
		cars.add(null);
		

		Iterator<String> it = cars.iterator();
		while(it.hasNext())
		{
			Object ob = it.next();
			System.out.println(ob);
		}  
	System.out.println("*********************************");
	cars.forEach(a->
			{
			
				System.out.println(a);
			});
	}
}
