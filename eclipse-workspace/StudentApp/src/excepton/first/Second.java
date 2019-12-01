package excepton.first;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10;
     int b=0;
     int c=0;
     try {
    	 b= 10/0;
    	 System.out.println(b);
    	 System.out.println("Hello");
    	 System.out.println("Happy Deepavali ");
     }
     catch(ArithmeticException ae)
     {
    	 System.out.println(ae);
     }
     
     System.out.println("main method ended");
	}

}
