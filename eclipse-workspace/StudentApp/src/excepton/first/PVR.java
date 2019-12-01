package excepton.first;

public class PVR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 void book() {
	System.out.println(" booking started ");
	try {
		System.out.println(10/0);
		System.out.println(" logic for booking ");
		System.out.println(" booking confirmed ");
	}
	catch(ArithmeticException ae )
	{
		System.out.println("booking failed");
		throw e;
	}
}
	}

}
