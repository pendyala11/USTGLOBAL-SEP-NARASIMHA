package com.ustglobal.java8.Predicates;

import java.util.function.Consumer;

import com.ustglobal.java8.Student;

public class TestF {
	
	
	
	public static void main(String[] args) {
		
		Consumer<Student> c = s ->{
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("============================");
		};
		
		Student s1 = new Student(10,"bhavani", 67.9);
		c.accept(s1);
		
		
		
	}

}
