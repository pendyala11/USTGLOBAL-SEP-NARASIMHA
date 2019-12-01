package exception;

public class TestA {
public static void main(String[] args) {
	System.out.println(" main method ");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		System.out.println("Exception caught");
		e.printStackTrace();
	}
	System.out.println(" ended");
}
}
