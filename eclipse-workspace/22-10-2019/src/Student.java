
public class Student {
     int rollno;
     String  name;
     int mobileno;
     String email;
     int age;
     
     Student(int srollno,String sname,int smobileno,String semail,int sage)
     {
    	 rollno=srollno;
    	 name=sname;
    	 mobileno=smobileno;
    	 email=semail;
    	 age=sage;
    	 
     }
     
     Student(int lidno,String  lname)
     {
    	 this.rollno = lidno;
    	 this.name =lname;
     }
     void display()
     {
    	 System.out.println(rollno);
    	 System.out.println(name);
    	 System.out.println(mobileno);
    	 System.out.println(email);
    	 System.out.println(age);
     }
     public static void main (String args[])
     {
    	 Student s1 = new Student(1,"simran",957333033,"simran@gmail",34);
         s1.display();
         Student s2 = new Student(2,"narasimha",957333032,"simran@gmail",23);
         s2.display(); 
         Student s3 = new Student(5,"rohit");
         s3.display(); 
     }
     
    

     
}
