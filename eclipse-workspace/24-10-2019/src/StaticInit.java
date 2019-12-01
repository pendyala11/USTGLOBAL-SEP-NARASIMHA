
public class StaticInit {
        static int a;
        static int b;
        static {
        	a=10;
        	System.out.println(" first static block ");
        	
        }
        StaticInit(){
        	System.out.println(" constructor ");
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInit s = new StaticInit();
		StaticInit s1 = new StaticInit();
	}
   static {
	   b=20;
	   System.out.println(" second static block");
   }
}
