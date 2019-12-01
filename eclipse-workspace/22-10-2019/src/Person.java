
public class Person {
      
	String name;
         int age;
         Person(String ename,int eage)
         {
        	 name =ename;
        	 age = eage;
         }
         void print() {
        	 System.out.println(name);
        	 System.out.println(age);
         }
         public static void main(String[] args)
         {
        	
        	 Person p2 = new  Person("simha",456);
        	 p2.print();
        	 Person p3 = new  Person("narasimha",156);
        	 p3.print();
        	 Person p4 = new  Person("naidu",356);
        	 p4.print();
         }
         
        
}
