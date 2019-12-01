
public class CallbyValue {
	static int data=50;
	
	 void change(CallbyValue c)
	 {
		 c.data = c.data+500;
	}
	public static void main(String[] args) {
System.out.println(" before call by value "+data);
		CallbyValue c = new CallbyValue();
		c.change(c);
		
		System.out.println(" after call by value "+data);
		
	}
}
