
public class InstanceInit {
     static int a;
     int b;
     {
    	 a=10;
    	 b=20;
    	 System.out.println(" non static block 1");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(" main started");
    InstanceInit i = new InstanceInit();
    InstanceInit i1 = new InstanceInit();
    System.out.println(" main ended");
    
	}
	
	{
		System.out.println(" non static block 2");
	}

}
