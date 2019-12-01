package excepton.first;

public class Testc {

	public static void main(String[] args) {
		System.out.println(" Main started  ");
		int[] a= {10,20,30};
         int b=10;
         try {        
        	 System.out.println(b/0);
         }
         catch(ArithmeticException ae)
         {
        	 System.out.println(" number divide by zero");
        	 
         }
         try {
        	 System.out.println(a[5]);
        	
         }
         
         catch(ArrayIndexOutOfBoundsException ai) {
        	 System.out.println(" array index not present");
         }
         System.out.println(" main endedn");
	}

}
