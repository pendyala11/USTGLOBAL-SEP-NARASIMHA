package Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Testyyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employ e1 = new Employ(1, "suresh","tester");
 Employ e2 = new Employ(2, "rajesh","analyst");
 Employ e3 = new Employ(3, "rakesh","manager");
 Employ e4 = new Employ(4, "rupesh","assosiate engineer");
 Employ e5 = new Employ(5, "mahesh","senior engineer");
 Employ e6 = new Employ(6, "ravi","software developer");
 Employ e7 = new Employ(7, "hari","software engineer");
 Employ e8 = new Employ(8, "naresh","devops engineer");
 Employ e9 = new Employ(9, "kiran","senior manager");
 ArrayList<Employ> al = new ArrayList<Employ>();
 al.add(e1);
 al.add(e2);
 al.add(e3);
 ArrayList<Employ> al1 = new ArrayList<Employ>();
 al1.add(e4);
 al1.add(e5);
 al1.add(e6);
 ArrayList<Employ> al2 = new ArrayList<Employ>();
 al2.add(e7);
 al2.add(e8);
 al2.add(e9);
 
 HashMap<String, ArrayList<Employ>> hm = new HashMap<>();
	
	hm.put("manager1",al);
	hm.put("manager2",al1);
	hm.put("manager3",al2);
	ArrayList<Employ> first = hm.get("second");
    Iterator<Employ> it =first.iterator();
    
    while(it.hasNext()) {
   	 Employ s = it.next();
   	 System.out.println("id is "+s.id);
   	 System.out.println("name is  "+s.name);
   	 System.out.println(" Designation is "+s.Designation);
   	 System.out.println("***************************************************");
    }
 
 
	}

}
