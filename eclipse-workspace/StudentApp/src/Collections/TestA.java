package Collections;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {

		ArrayList<Student> al =new ArrayList<Student>();
		
		Student s1 = new Student(1, "narasimha", 12);
		Student s2 = new Student(2, "simha", 13);
		Student s3 = new Student(1, "rakesh", 15);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(" before sorting");
		displayStudentDetails(al);
		Collections.sort(al);
		
		static void displayStudentDetails(ArrayList<Student> al)
		{
			Iterator<Student> it = al.iterator();
			while(it.hasNext())
			{
				Student s =it.next();
				System.out.println("id is "+s.id);
				System.out.println(" name is "+s.name);
				System.out.println(" percentage is"+s.Percentage);
			}
		}
	}

}
