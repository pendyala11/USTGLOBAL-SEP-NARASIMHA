package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person(1,"raju");
		System.out.println("p1 id is "+p.id);
		System.out.println("p1 name is "+p.name);
		
		 Object o =p.clone();
		 Person p2 = (Person) o;
		 System.out.println("p2 id is "+p2.id);
		 System.out.println("p2 name is "+p2.name);
		 
		 p2.id=200;
		 p2.name = "surya";
		 System.out.println("-------------after cloning----------------");
		 System.out.println("p1 id is "+p.id);
		 System.out.println("p1 name is "+p.name);
   	   	System.out.println("p2 id is "+p2.id);
		 System.out.println("p2 name is "+p2.name);
		
		 
		
		
		
	}

}
