
public class Employee1 {
	
	      
		String name;
	         int age;
	        Employee1(String ename,int eage)
	         {
	        	 this.name =ename;
	        	 this.age = eage;
	         }
	         void print() {
	        	 System.out.println(name);
	        	 System.out.println(age);
	         }
	     public static void main() {
	    	 Employee1 e1 =new Employee1();
	    	 e1.print();
	     }
}
