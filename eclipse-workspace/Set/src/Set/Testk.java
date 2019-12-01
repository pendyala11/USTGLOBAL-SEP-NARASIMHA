package Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Testk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Employee> comp =(e1,e2) ->
		{
//			if(e1.height>e2.height)
//			{
//				return 1;
//			}
//			else if(e1.height<e2.height)
//			{
//				return -1;	
//			}
//			else
//			{
//				return 0;
//			}
			
//			return e1.name.compareTo(e2.name);
			
			Integer x = e1.id;
			Integer y = e2.id;
			
			return x.compareTo(y);
		};
		
TreeSet<Employee> ts= new TreeSet<Employee>(comp);

Employee e1 = new Employee(4, "niki", 6.1);
Employee e2 = new Employee(5, "baskhar", 5.8);
Employee e3 = new Employee(6, "suresh", 5.9);
Employee e4 = new Employee(7, "dinesh", 6.0);
ts.add(e1);
ts.add(e2);
ts.add(e3);
ts.add(e4);

System.out.println(" ********** using iterator ************");
Iterator<Employee> it = ts.iterator();
while(it.hasNext())
{
	Employee e = it.next();
	System.out.println(" name is " +e.name);
	System.out.println(" id is "+e.id);
	System.out.println("height is "+e.height);
}

	}

}
