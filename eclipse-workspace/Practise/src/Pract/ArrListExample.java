package Pract;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cars> al = new ArrayList<Cars>();
		Cars c1 = new Cars("benz","blue",2500000);
		Cars c2 = new Cars("aston martin","red",1500000);
		Cars c3 = new Cars("toyoto","orange",1200000);
		al.add(c1);
		al.add(c2);
		al.add(c3);
	Iterator<Cars> it =al.iterator();
	while(it.hasNext())
	{
		Cars ob = it.next();
		System.out.println(ob.name);
	}
	}

}
