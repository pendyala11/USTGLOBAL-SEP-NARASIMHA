package Set;

import java.util.TreeSet;
import java.util.Iterator;

public class TestG  implements Comparable{

	public static void main(String[] args) {
		TreeSet<Employeea> hs = new TreeSet<Employeea>();
		Employeea e1 = new Employeea(12, "sweety", 450000);
		Employeea e2 = new Employeea(21, "teju", 550000);
		Employeea e3 = new Employeea(31, "sheela", 650000);
		Employeea e4 = new Employeea(31, "sheela", 650000);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		
		System.out.println("****************Using Iterator****************");
		Iterator<Employeea> it =hs.iterator();
		while(it.hasNext())
		{
			Employeea e =it.next();
			System.out.println("id is "+e.id);
			System.out.println("name is "+e.name);
			System.out.println("salary is "+e.salary);
		}
		

	}

}
