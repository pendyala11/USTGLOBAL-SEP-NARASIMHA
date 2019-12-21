package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(102,"dimple",35.6);
		Student s2 = new Student(101,"bunty",34.6);
		Student s3 = new Student(103,"Crazy",35.6);
		Student s4 = new Student(104,"rockers",35.6);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("before sorting===============>");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("after sorting ==============>");
		displayStudentDetails(al);
		
	}
	
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s= it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentnage is "+s.percentage);
			
			System.out.println("==================================");
		}
	}

}
