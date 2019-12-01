
public class Class1 {
        String name;
        int rollno;
       final String cname = "QSPIDERS";
       final int cid;
       
       Class1(String name , int rollno , int cid )
  {
	  this.name=name;
	  this.rollno =rollno;
	  this.cid=cid;
  }
       
       
       final void print() {
    	   System.out.println("hi"+name+"welcome to "+cname);
       }
       final void print(String name) {
    	   System.out.println("hi"+name+"welcome to "+cname);
       }
}
