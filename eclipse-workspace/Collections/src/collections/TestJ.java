package collections;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al = new ArrayList<Student>();
Student s1 = new Student(1,"narasimha");
Student s2 = new Student(1,"simha");
al.add(s1);
al.add(s2);

for(int i=0;i<al.size();i++)
{
	Student s = al.get(i);
	System.out.println(s.id);
	System.out.println(s.name);
}
	}

}
